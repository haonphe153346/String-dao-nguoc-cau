
package javaapplication3;

import java.util.Scanner;

public class JavaApplication3 {
    
    public static String reverse(String s){
        
        char[] letter = new char[s.length()];
        int letterIndex = 0;
        
        for(int i=s.length()-1;i>=0;i--){
            letter[letterIndex] = s.charAt(i);
            letterIndex++;
        }
        
        String reverse = "";
        
        for(int i=0;i<s.length();i++){
            reverse = reverse + letter[i];
        }
        
        return reverse;
    }

    public static void main(String[] args){
        
        System.out.println("Enter your String:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverse(s));
    }
    
}
