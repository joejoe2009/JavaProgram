// (Financial application: calculate tips) Write a program that reads the subtotal
// and the gratuity rate and then computes the gratuity and total. For example, if the
// user enters 10 for subtotal and 12% for gratuity rate, the program displays $1.2
// as gratuity and $11.2 as total. Here is a sample run:

import java.util.Scanner;

public class FinancialAppCalculateTips {
  public static void main(String[] args) {

  Scanner input = new Scanner(System.in);

  System.out.print (" Enter the subtotal and a gratuity rate: ");
  double subtotal = input.nextDouble();
  double gratuityRate = input.nextDouble();

  //Compute gratuity and total

  double gratuity = subtotal * (gratuityRate / 100);
  double total = subtotal + gratuity;

  // Display Result 

System.out.println(" The gatuity is $" + gratuity + " and total is $" + total );

}
}