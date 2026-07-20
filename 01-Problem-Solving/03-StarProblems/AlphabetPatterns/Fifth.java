/*
E
D E
C D E
B C D E
A B C D E
*/

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Rows :");
        int num=sc.nextInt();
        int ch='A'+num-1;
        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)(ch-(i-j))+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
