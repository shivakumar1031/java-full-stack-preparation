/*
Problem Statement

Given an integer array and a target element,
count how many times the target appears in the array.

Input
arr = {10, 20, 10, 30, 10, 40, 50, 10}
target = 10

Output
Frequency of 10 = 4

Approach:
Linear Traversal

Time Complexity: O(n)
Space Complexity: O(1)
*/


public class CountFrequencyOfElement {
    public static void main(String[] args) {
        int arr[] = {10, 20, 10, 30, 10, 40, 50, 10};
        int target = 10,count=0;
        for(int i:arr){
            if(i==target)
                count++;
        }
        System.out.println("Frequency of "+ target+" = "+count);
    }
}
