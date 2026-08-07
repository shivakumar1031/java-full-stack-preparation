/*
Problem Statement

Rotate the array one position to the left.

The first element should move to the last position.

    Sample Input
    6
    10 20 30 40 50 60

    Sample Output
    20 30 40 50 60 10
*/
public class RotateArrayLeftByOne {
    public static void main(String[] args) {
        int arr[]={10 ,20 ,30 ,40 ,50 ,60};
        int temp=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
        for(int i: arr)
            System.out.print(i+" ");
    }
}
