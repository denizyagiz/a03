// Class: CS 5000
// Term: Summer 2020
// Name: Deniz Yagiz
// Instructor: Dr. Haddad
// Assignment: 3
// IDE Name: Jgrasp
//Scanner is stored in java.util package
import java.util.Scanner;
public class StringMethods
{
//Main method

   public static void main(String[] args)
   {
   //Create scanner
      Scanner sc = new Scanner (System.in);
   //Prompt user
      String string1, string2;     
      System.out.println("Please enter string1: ");
      string1 = sc.nextLine();
      System.out.println("Please enter string2: ");
      string2 = sc.nextLine();
   // Part A: Determine the length of string_1
      int length1 = string1.length();
      char last1 = string1.charAt(length1 - 1);
      System.out.println("Length of String 1:\t " + length1 + " " + "characters");
   // Part B: Determine the length of string_2
      int length2 = string2.length();
      char last2 = string2.charAt(length2 - 1);
      System.out.println("Length of String 2:\t " + length2 + " " + "characters");
   // Part C: Concatenate both strings, separated by space
      System.out.println("Concatenation:\t\t\t " + (string1 + " " + string2));
      
      
   // Part D: Check if the two strings have same set of characters with regard to case (i.e., equal)
      if (string1.equals(string2)) {
         System.out.println("Equal Strings?\t\t\t" + " Equal");
      }
      else
      {
         System.out.println("Equal Strings?\t\t\t" + " Not Equal");
      }
   // Part E: Convert string_1 to upper case
      System.out.println("Uppercase String 1:\t "+string1.toUpperCase());
   // Part F: Convert string_2 to lower case.
      System.out.println("Lowercase Sting 2:\t "+string2.toLowerCase());
       
   // Part G: Extract a valid sub-string of multiple characters from string_1
     
     
      
      if (string1.length() > 1 && string1.length() > 3) {
         System.out.println("Valid substring:\t\t "+ string1.substring(1, 3));
      } else {
         System.out.println("Not enough characters!");
      }
   
   
   
   }
}