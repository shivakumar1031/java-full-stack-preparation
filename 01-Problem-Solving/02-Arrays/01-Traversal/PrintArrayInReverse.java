/*
Problem Statement

Given an array of integers, print all elements in reverse order.

    Sample Input
    5
    12 5 30 8 45

    Sample Output
    45 8 30 5 12
*/

public class PrintArrayInReverse {
    public static void main(String[] args) {
        int arr[] = {12,5,30,8,45};
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+ " ");
        }
    }
}
