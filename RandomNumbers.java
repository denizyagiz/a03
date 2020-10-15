// Class: CS 5000
// Term: Summer 2020
// Name: Deniz Yagiz
// Instructor: Dr. Haddad
// Assignment: 3
// IDE Name: Jgrasp
//Scanner is stored in java.util package
import java.util.Random;
public class RandomNumbers
{
//Main method
   public static void main(String[] args)
   {
   //Create random
      Random rd = new Random();
   //Prompt user
      int x ;
      int y ;
      int z ;
      float d ;
      
      x=20+ rd.nextInt(80-20+1);
      
      y=-20+ rd.nextInt(20-(-20)+1);
      
      z=-50+ rd.nextInt(-20-(-50)+1);
      
      d=(float)((21.9999-0+Float.MIN_VALUE) * rd.nextFloat());
      
      
   // Part A: Generate random integer number between 20 and 80 (inclusive)
      System.out.println("A random integer between 20 and 80 (inclusive):\t\t\t" + x);
   // Part B: Generate random integer number between -20 and 20 (inclusive)
      System.out.println("A random integer between -20 and 20 (inclusive):\t\t" + y);
   // Part C: Generate random integer number between -50 and -20 (inclusive)
      System.out.println("A random integer between -50 and -20 (inclusive):\t\t" + z);
   // Part D: Generate random float between 0.0 and 21.9999 (inclusive)
      System.out.println("A random float between 0.0 and 21.9999 (inclusive):\t" + d);
      
      
      
      
   }
}
