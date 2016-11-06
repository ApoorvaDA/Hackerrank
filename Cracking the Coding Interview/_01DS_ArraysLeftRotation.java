/*
A left rotation operation on an array of size  shifts each of the array's elements 1 unit to the left. 
For example, if left rotations are performed on array [1,2,3,4,5], then the array would become [3,4,5,1,2].

Given an array of n integers and a number,d, perform d left rotations on the array. 
Then print the updated array as a single line of space-separated integers.

Input Format
The first line contains two space-separated integers denoting the respective values of n(the number of integers) and d(the number of left rotations you must perform). 
The second line contains n space-separated integers describing the respective elements of the array's initial state.

Output Format
Print a single line of n space-separated integers denoting the final state of the array after performing d left rotations.

Sample Input
5 4
1 2 3 4 5

Sample Output
5 1 2 3 4

Explanation

When we perform d left rotations, the array undergoes the following sequence of changes:
[1,2,3,4,5] -> [2,3,4,5,1] -> [3,4,5,1,2] -> [4,5,1,2,3] -> [5,1,2,3,4]
Thus, we print the array's final state as a single line of space-separated values, which is 5 1 2 3 4.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
      
      for(int j=0; j<k; j++){
        int temp=a[0];
        for(int i=0; i<n-1; i++){
          a[i]=a[i+1];
        }
        a[n-1]=temp;  
      }
      
      return a;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
      
        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();
      
    }
}
