/*
Problem Statement

Given an array of distinct integers, print the second largest element.

    Sample Input
    6
    15 8 90 25 70 40

    Sample Output
    Second Largest Element : 70

Note

Assume all elements are distinct.
*/
public class FindSecondLargestElement {
    public static void main(String[] args) {
        int arr[]= {15 ,8 ,90 ,25 ,70 ,40};
        int first_max=arr[0],second_max=arr[0];
        for(int i:arr){
            if(first_max<i){
                second_max=first_max;
                first_max=i;
                
            }
            else if(second_max<i)
                second_max=i;
        }
        System.out.println("Second Largest Element : "+second_max);
    }
}
