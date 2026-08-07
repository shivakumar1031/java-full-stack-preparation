/*
Problem Statement

Given an integer array, print all duplicate elements.
Each duplicate element should be printed only once.

    Input
    arr = {10, 20, 30, 20, 10, 40, 50, 40, 10}

    Output
    10
    20
    40

Approach:
Nested Loops

Time Complexity: O(n²)
Space Complexity: O(1)

*/

public class PrintDuplicateElements {
    public static void main(String[] args) {
        int arr[] ={10, 20, 30, 20, 10, 40, 50, 40, 10};
        
        for(int i=0;i<arr.length;i++){
            boolean alreadyPrinted=false;
            for(int k=0;k<i;k++){
                if(arr[k]==arr[i])
                    alreadyPrinted=true;
            }
            if(alreadyPrinted)
                continue;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    break;
                }
            }   
        }
    }
}


/* 
Learning

1. Check previous elements (0 to i-1) to know whether the current element
   has already been processed.

2. Check next elements (i+1 to n-1) to determine whether the current
   element is a duplicate.

3. Use a boolean flag to decide wheater current element is appeared before then move the iteration outer loop 
    other wise check the next elements from the current element, here i used continue for skiping . 
*/
