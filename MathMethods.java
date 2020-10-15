// Class: CS 5000
// Term: Summer 2020
// Name: Deniz Yagiz
// Instructor: Dr. Haddad
// Assignment: 3
// IDE Name: Jgrasp
import java.util.Scanner;

public class MathMethods {
//Main method
   public static void main (String[] args)
   {  
   //Create scanner
   
      Scanner scan = new Scanner(System.in);
   // Part A: Enter a negative number and print its absolute value
      System.out.println("Enter a negative integer number: ");
      int negative;
      negative=scan.nextInt();
      System.out.println("The absolute value of "+ negative +" is " + Math.abs(negative));
   // Part B: Enter a floating-point number representing an angle and print the angle’s cosine, sine, and tangent values
      System.out.println("Enter a floating-point number representing an angle: ");
      double angle;
      angle=scan.nextDouble();
      System.out.println("The cosine of this angle is:\t " + Math.cos(angle));
      System.out.println("The sine of this angle is:\t\t " + Math.sin(angle));
      System.out.println("The tangent of this angle is:\t " + Math.tan(angle));
   // Part C: Enter a floating point number and print both of its floor and ceiling values
      System.out.println("Enter a floating point number: ");
      double floating;
      floating=scan.nextDouble();
      System.out.println("The floor value of "+floating+" is:\t\t " + Math.floor(floating));
      System.out.println("The ceiling value of "+floating+" is:\t " + Math.ceil(floating));
   // Part D: Enter a two floating-point numbers (say X and Y) and print the value of XY (X is raised to the power of Y)
      System.out.println("Enter a floating-point number as X: ");
      double x;
      x=scan.nextDouble();
      System.out.println("Enter a floating-point number as Y: ");
      double y;
      y=scan.nextDouble();
      System.out.println("The value of X^Y is: " + Math.pow(x,y));
   // Part E: Enter an integer number and print its square root
      System.out.println("Enter an integer number: ");
      int integer;
      integer=scan.nextInt();
      System.out.println("The square root of 16 is " + Math.sqrt(integer));
   
   
      
   
      
      
      
      
   
      
      
   }
      
}      
      

      
