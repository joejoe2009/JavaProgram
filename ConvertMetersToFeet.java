// Convert meters into feet) Write a program that reads a number in meters, converts
// it to feet, and displays the result. One meter is 3.2786 feet. 

import java.util.Scanner;
public class ConvertMetersToFeet {
  public static void main(String[] args) { 
  
  Scanner input = new Scanner (System.in);

  System.out.print ("Enter a value for meter: ");
  double meter = input.nextDouble();

  double feet = meter * 3.2786;

  // Display Result
 System.out.println (" " + meter + " meters is " + feet + " feet ");



}
}