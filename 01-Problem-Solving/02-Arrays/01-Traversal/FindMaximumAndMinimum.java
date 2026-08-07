/*
Problem Statement

Given an array of integers, find and print the largest and smallest element.

    Sample Input
    7
    12 45 7 89 23 56 3

    Sample Output
    Maximum Element : 89
    Minimum Element : 3
*/

public class FindMaximumAndMinimum {
    public static void main(String[] args) {
        int arr[] = {12 ,45, 7 ,89, 23, 56, 3};
        int min=arr[0],max=arr[0];
        for(int i: arr){
            if(max<i)
                max=i;
            if(min>i)
                min=i;
        }
        System.out.println("Maximum Element : "+max);
        System.out.println("Maximum Element : "+min);
    }
}
