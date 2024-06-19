//String on reversal reads the same

import java.util.Scanner;

public class Palindrome {

    static boolean checkPalindrome(String s1,int n,int i){
        if(i>=n/2){
            return true;
        }
        if(s1.charAt(i)!=s1.charAt(n-i-1)){
            return false;
        }
        return checkPalindrome(s1, n, i+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String s1 = sc.nextLine();
        int i=0;
        int n= s1.length();
        if(checkPalindrome(s1,n,i)){
            System.out.println("the given string is palindrome");
        }
        else{
            System.out.println("given string is not palindrome");
        }

        sc.close();

    }
}
