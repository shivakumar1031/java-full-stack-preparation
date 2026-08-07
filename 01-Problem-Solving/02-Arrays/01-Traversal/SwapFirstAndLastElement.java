/*
    Sample Input
    5
    10 20 30 40 50

    Sample Output
    50 20 30 40 10
*/

public class SwapFirstAndLastElement {
    public static void main(String[] args) {
        int arr[]={10 ,20 ,30 ,40 ,50};
        int temp=arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=temp;
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
