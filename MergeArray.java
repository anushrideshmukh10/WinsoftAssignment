/* 
 * Q1: Merge two arrays by satisfying given constraints
Given two sorted arrays X[] and Y[] of size m and n each where m >= n and X[] has exactly n vacant cells,
 merge elements of Y[] in their correct position in array X[], i.e., merge (X, Y) by keeping the sorted order.

For example,

Input: X[] = { 0, 2, 0, 3, 0, 5, 6, 0, 0 }
Y[] = { 1, 8, 9, 10, 15 } The vacant cells in X[] is represented by 0 
Output: X[] = { 1, 2, 3, 5, 6, 8, 9, 10, 15 }

 */
import java.util.Arrays;

public class MergeArray {
    
    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        
        // Move all non-zero elements of X to the beginning
        int k = 0;
        for (int i = 0; i < m; i++) {
            if (X[i] != 0) {
                X[k++] = X[i];
            }
        }
        
        // Merge X and Y
        int i = k - 1; 
        int j = 0;    
        int idx = 0;   
        
        while (i >= 0 && j < n) {
            if (X[i] > Y[j]) {
                X[idx++] = Y[j++];
            } else {
                X[idx++] = X[i--];
            }
        }
        
        // If elements in Y[] are still remaining, copy them to X[]
        while (j < n) {
            X[idx++] = Y[j++];
        }
    }
    
    public static void main(String[] args) {
        int[] X = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] Y = {1, 8, 9, 10, 15};
        
        mergeArrays(X, Y);
        
        System.out.println("Merged Array: " + Arrays.toString(X));
    }
}

/*
 
Output :-
Merged Array: [1, 6, 5, 6, 1, 8, 9, 10, 15]

 */
