/*
Problem Statement

Given an integer array, print only the first occurrence of each element.

Input
arr[] = {10, 20, 30, 20, 10, 40, 50, 40, 10}

Output
10 20 30 40 50
*/

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 20, 10, 40, 50, 40, 10};
        for(int i=0;i<arr.length;i++){
            boolean AlreadyPrinted=false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    AlreadyPrinted=true;
                    break;
                }
            }
            if(AlreadyPrinted)
                continue;
            System.out.print(arr[i]+ " ");
        }
    }
}
