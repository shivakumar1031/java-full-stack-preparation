/*
Problem Statement

Given an integer array, print the first element
that appears exactly once.

Input
arr[] = {10, 20, 30, 20, 10, 40, 30}

Output
40

Approach:
Nested Loops

Time Complexity: O(n²)
Space Complexity: O(1)
*/


public class FirstUniqueElement {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 20, 10, 40, 30};
        for(int i=0;i<arr.length;i++){
            boolean alreadyPresent=false,flag=false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    alreadyPresent=true;
                    break;
                }
            }
            if(alreadyPresent)
                continue;
            for(int k=i+1;k<arr.length;k++){
                if(arr[i]==arr[k]){
                    flag=true;
                    break;
                }
                
            }
            if(!flag){
                System.out.print(arr[i]+ " ");
                break;
            }
                
        }
    }
}
