/* 
 Q4:Write a Java Program to find the duplicate characters in a string.
*/

import java.util.HashMap;
import java.util.Map;

public class DuplicateChar {
    public static void findDuplicateCharacters(String str) {
        // Create a HashMap to store character frequencies
        Map<Character, Integer> charFrequencyMap = new HashMap<>();
        
        str = str.toLowerCase();
        
        
        for (char c : str.toCharArray()) {
            charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
        }
        
        // Print the characters with frequency greater than 1 (indicating duplicates)
        System.out.println("Duplicate characters in the string:");
        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
    
    public static void main(String[] args) {
        String str = "Anushri Deshmukh";
        findDuplicateCharacters(str);
    }
}

/*

Output :-
Duplicate characters in the string:
a : 1
n : 1
h : 2
i : 1
u : 2
s : 2
r : 1
m : 1
k : 1
 */