/*
Problem Statement

Given an integer array, find the element that appears
the maximum number of times.

If multiple elements have the same highest frequency,
print the one that appears first.

    Input
    arr[] = {10, 20, 30, 10, 40, 20, 10, 50, 20, 10}

    Output
    Most Frequent Element = 10
    Frequency = 4

Approach:
Nested Loops

Time Complexity: O(n²)
Space Complexity: O(1)
*/

public class MostFrequentElement {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 10, 40, 20, 10, 50, 20, 10};
        int max=0,element=0;
        for(int i=0;i<arr.length;i++){
            int count=0;
            boolean alreadyPresent=false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    alreadyPresent=true;
                    break;
                }
            }
            if(alreadyPresent)
                continue;
            for(int k=i+1;k<arr.length;k++){
                if(arr[k]==arr[i])
                    count++;
            }
            if(max<count){
                max=count;
                element=arr[i];
            }
        }
        System.out.print("Most Frequent Element = "+element+"\n"+"Frequency = "+max);
    }
}
