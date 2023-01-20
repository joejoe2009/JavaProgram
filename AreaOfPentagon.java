/* (Geometry: area of a pentagon) Write a program that prompts the user to enter
the length from the center of a pentagon to a vertex and computes the area of the
pentagon   The formula for computing the area of a pentagon is Area = 5 * s
where s is the length of a side. The side can be computed using the formula s = 2r sin p
5, where r is the length from the center of a pentagon to a vertex. Round up two digits
after the decimal point. Here is a sample run: */

import java.util.Scanner;
public class AreaOfPentagon {
  public static void main(String[] args) { 

  //Create Scanner

 Scanner input = new Scanner(System.in);
 
 //Prompt user to enter the length 

 System.out.print(" Enter the length from the center of a pentagon to a vertex: ");
 double r = input.nextDouble();

 //Computes the area of the pentagon

 double s = (2 * r) * Math.sin(Math.PI / 5);

 double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI/5));

 //Display result
  System.out.printf("The area of the pentagon is %5.2f\n", area);

    }
}

