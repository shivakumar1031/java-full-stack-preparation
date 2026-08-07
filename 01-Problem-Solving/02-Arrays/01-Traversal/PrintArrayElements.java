/*
Problem Statement:
Given an array of integers, print all elements in the same order separated by spaces.

Sample Input
6
10 20 30 40 50 60

Sample Output
10 20 30 40 50 60
*/

public class PrintArrayElements {
    public static void main(String args[]){
        int arr[] = {10,20,30,40,50,60};
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
