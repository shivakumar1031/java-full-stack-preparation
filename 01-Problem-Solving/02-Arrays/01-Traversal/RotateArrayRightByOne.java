/*
Problem Statement

Rotate the array one position to the right.

The last element should move to the first position.

    Sample Input
    6
    10 20 30 40 50 60

    Sample Output
    60 10 20 30 40 50
*/
public class RotateArrayRightByOne {
    public static void main(String[] args) {
        int arr[]={10 ,20 ,30 ,40, 50, 60};
        int temp=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
