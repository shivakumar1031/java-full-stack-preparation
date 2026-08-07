/*
Problem Statement

Given an integer array, build its prefix sum array.

The prefix sum at index i is the sum of all elements
from index 0 to i.

    Input
    arr = {2, 4, 6, 8, 10}

    Output
    Prefix Sum Array:
    2 6 12 20 30

Approach:
Prefix Sum

Time Complexity: O(n)
Space Complexity: O(n)
*/

public class BuildPrefixSumArray {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        int length=arr.length;
        int prefix_sum[] = new int[length];

        prefix_sum[0]=arr[0];
        
        for(int i=1;i<length;i++){
                prefix_sum[i]=prefix_sum[i-1]+arr[i];
        }
        for(int i:prefix_sum)
            System.out.println(i);
    }
}
