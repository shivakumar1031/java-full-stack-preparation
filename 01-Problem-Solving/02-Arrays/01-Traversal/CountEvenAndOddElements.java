/*
    Sample Input
    7
    10 15 22 31 40 51 60

    Sample Output
    Even Count : 4
    Odd Count  : 3
*/
public class CountEvenAndOddElements {
    public static void main(String[] args) {
        int arr[] = {10 ,15, 22, 31, 40, 51, 60};
        int even_count=0,odd_count=0;
        for(int i:arr){
            if((i^1)==0)
                even_count++;
            else
                odd_count++;
        }
        System.out.print( "Even Count :"+even_count+"\n"+"Odd Count : "+odd_count);
    }
}
