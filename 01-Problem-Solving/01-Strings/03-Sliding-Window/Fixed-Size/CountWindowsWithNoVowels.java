/*
Problem Statement

Given a string and an integer K (window size), count the number of substrings of length K that contain no vowels.

A vowel is one of:
a, e, i, o, u

Constraints
1 <= String length <= 10^5
1 <= K <= String length

Sample Input:
String: abciiidfg
K: 3

Sample Output:
1

Explanation
abc -> 1 vowel ✗
bci -> 1 vowel ✗
cii -> 2 vowels ✗
iii -> 3 vowels ✗
iid -> 2 vowels ✗
ide -> 2 vowels ✗
dfg -> 0 vowels ✓
*/


import java.util.Scanner;
public class CountWindowsWithNoVowels {
    static boolean isVowel(char ch){
        char chr=Character.toLowerCase(ch);
        return chr=='a'||chr=='e'||chr=='i'||chr=='o'|| chr=='u';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sting value: ");
        String str = sc.nextLine();
        System.out.print("Enter Window size K :");
        int k=sc.nextInt();


        int right =k,left=0,count=0;
        for(int i=0;i<right;i++){
            if(isVowel(str.charAt(i)))
                count++;
        }
        if(count==0){
            System.out.println(str.substring(left,right)+"--> "+count);
            return;
        }
        while(right<str.length()){
            if(isVowel(str.charAt(left)))
                count--;
            if(isVowel(str.charAt(right)))
                count++;
            left++;
            right++;
            if(count==0){
                System.out.println(str.substring(left, right)+"--> "+count);
                return;
            }
        }
        System.out.println("The substring contains atleast one vowel ");

    }   
}
