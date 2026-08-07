package diamonds;
/*
Diamond

Input

9

Output

        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *


Logic Behind This Solution
--------------------------

Instead of finding the star condition directly, I first found the
leading-space condition.

1. Observe the number of leading spaces in each row.
2. Derive a formula for the spaces:
       spaces = Math.abs(mid - i)
3. The j-loop runs only until the last required column:
       lastColumn = num - 1 - spaces
4. During each iteration:
       - If j < spaces, print spaces.
       - Otherwise (j >= spaces), print stars.

How I Derived the Formula
-------------------------
I wrote down the ending boundary (last star position) for every row and
compared it with the row number (i). From this observation, I found the
relationship:

       lastColumn = num - 1 - Math.abs(mid - i)

After finding the boundary, printing the pattern became straightforward.

Key Learning
------------
For symmetric patterns like Diamond, Hourglass, and Butterfly,
it is often easier to:
    1. Find the leading spaces.
    2. Find the ending boundary.
    3. Print stars between those boundaries.

This approach helps derive the pattern logically instead of memorizing
conditions.
*/

import java.util.Scanner;
public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<=num-1-Math.abs(num/2-i);j++){
                if(j<Math.abs(num/2-i))
                    System.out.print("  ");
                else if(j>=Math.abs(num/2-i))
                    System.out.print("* ");
            }
            System.out.println();
        }

    }
    
}
