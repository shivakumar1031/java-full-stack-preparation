/*
    Write a program to find first non repeating character in a given word?
    
    Sample Input:
    Enter the String : 
    shivasas

    Sample Output:
    h

*/
import java.util.Scanner;
public class FirstNonRepeatingCharacter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine().toLowerCase();
        int count[] = new int[26];
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='a'&&ch<='z')
                count[str.charAt(i)-'a']++;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a'&& ch<='z' && count[str.charAt(i)-'a']==1){
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}