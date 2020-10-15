// Class: CS 5000
// Term: Summer 2020
// Name: Deniz Yagiz
// Instructor: Dr. Haddad
// Assignment: 12
// IDE Name: Jgrasp

import java.util.Scanner;
public class Vowels {
   public static int countVowels(String s){
      if(s.length() > 0){
         char ch = s.charAt(0);
         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return 1+countVowels(s.substring(1));
         }
         else {
            return countVowels(s.substring(1));
         }
      }
      else{
         return 0;
      }
   }

   public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
      while(true){
         String   go="";
         System.out.print("Enter string: ");
         String s = scanner.nextLine();
         System.out.println("Entered string:\t"+ s);
         System.out.println("Number of vowels: "+ countVowels(s));
         System.out.println();
         System.out.print ("Do you want to run again? (y/n)? ");
         go = scanner.nextLine();
         if (go.equals("n"))
            break;
      
      }
   }

}