/*
Q.3: Write a Java Program to count the number of words in a string using HashMap.
*/

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static Map<String, Integer> countWords(String str) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        
        // Split the string into words using whitespace as delimiter
        String[] words = str.split("\\s+");
        
        // Count the frequency of each word
        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z0-9]", "");
            word = word.toLowerCase();
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        
        return wordCountMap;
    }
    
    public static void main(String[] args) {
        String text = "I am Anushri and I am Pursuing MCA";
        
        Map<String, Integer> wordCountMap = countWords(text);
        
        System.out.println("Word Counts:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

/*
 Output :-
 
Word Counts:
pursuing: 1
and: 1
i: 2
mca: 1
am: 2
Anushri: 1

 */