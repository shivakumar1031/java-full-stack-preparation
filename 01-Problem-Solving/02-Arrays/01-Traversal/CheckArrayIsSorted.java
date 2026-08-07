/*
    Sample Input
    5
    10 20 30 40 50

    Sample Output
    Array is Sorted
*/
public class CheckArrayIsSorted {
    public static void main(String[] args) {
        int arr[] = {10 ,20 ,30 ,40 ,50};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.print("Array is Not sorted");
                break;
            }
            else
                System.out.print("Array is Sorted");
        }
    }
}
