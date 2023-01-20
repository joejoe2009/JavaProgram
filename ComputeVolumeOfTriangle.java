// (Compute the volume of a triangle) Write a program that reads in the length of
// sides of an equilateral triangle and computes the area and volume using the following formulas:
 //area = 23 4 (length of sides)2
 // volume = area * length

import java.util.Scanner;
public class ComputeVolumeOfTriangle {
  public static void main(String[] args) { 
  
  Scanner input = new Scanner (System.in);

  System.out.print (" Enter length of the sides and height of the Equilateral triangle: ");
  double lengthOfSides = input.nextDouble();

  // Calculate the area
  double area = Math.sqrt(3) / 4 * (Math.pow(lengthOfSides, 2));
  
  // Calculate the area
  double volume = area * lengthOfSides;

  // Display result  
  System.out.println ("The area is " + area );
 System.out.println (" The Volume of the Triangular prism is " + volume );
  
 

}
}