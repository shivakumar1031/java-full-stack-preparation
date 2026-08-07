/*
Sandglass

Input
9

Output

* * * * * 
  * * * *
    * * *
      * *
        *
      * *
    * * *
  * * * *
* * * * *


Logic
-----
1. Observe the starting position of the stars in each row.
2. Compare the row index (i) to derive the starting boundary formula.
3. Print '*' from the starting boundary to the last column.
4. Print spaces before the starting boundary.

Key Idea
--------
Instead of memorizing the pattern, derive the starting star boundary by
observing how it changes with each row. Once the boundary is found,
print stars from that position and spaces before it.
*/

import java.util.Scanner;
public class Sandglass{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number :");
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<=num/2;j++){
                if(j>=num/2-Math.abs(num/2-i))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
