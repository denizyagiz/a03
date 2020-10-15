// Class: CS 5000
// Term: Summer 2020
// Name: Deniz Yagiz
// Instructor: Dr. Haddad
// Assignment: 3
// IDE Name: Jgrasp
import java.util.Scanner;

public class Payroll {
//Main method
   public static void main (String[] args)
   {  
   //Create scanner
   
      Scanner scan = new Scanner(System.in);
      String name;
      Scanner nm = new Scanner (System.in);
      System.out.println("Enter employee name: ");
      name = nm.nextLine();
   //Prompt user
      double  weekly;
      System.out.println("Enter weekly hours worked: ");
      weekly=scan.nextDouble();
      double  hourly ;
      System.out.println("Enter hourly pay rate: ");
      hourly=scan.nextDouble();
      double  federal  ;
      System.out.println("Enter federal tax rate: ");
      federal=scan.nextDouble();
      double state  ;
      System.out.println("Enter state tax rate: ");
      state=scan.nextDouble();
      
      double federalWithold = federal * hourly * weekly;
      double stateWithold = weekly * hourly * state;
      
      
      
      
      
   //Print results 
      System.out.println("Payroll statement");
      System.out.println("=================");
     
      System.out.println("Employee Name:\t\t\t " + name);
      System.out.println("Hours Worked:\t\t\t $" + weekly);
      System.out.println("Pay Rate (per Hour):\t $" + hourly);
      System.out.println("Gross Weekly Pay:\t\t $" + weekly * hourly);
      System.out.println("Federal Withholding:\t $" + federalWithold); 
      System.out.println("State Withholding:\t $" + stateWithold);    
      System.out.println("Net Pay:\t\t\t\t\t $" + (weekly * hourly - (stateWithold + federalWithold)));    
   
   }
}
