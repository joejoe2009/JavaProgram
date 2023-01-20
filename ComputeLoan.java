// create a program that computes loan payments.

import java.util.Scanner;
 
  public class ComputeLoan {
  public static void main(String[] args) {

  Scanner input = new Scanner(System.in);

  System.out.print("Enter annual interest rate, e.g., 4.25: " );
  double annualInterestRate = input.nextDouble();

 
  double monthlyInterestRate = annualInterestRate / 1200;

  System.out.print("Enter number of years as an integer, e.g., 25: " );
  int numberOfYears = input.nextInt();


  System.out.print("Enter Loan Amount, e.g., 402005.23: " );
  double loanAmount = input.nextDouble();

  //compute Payment

  double monthlyPayment = loanAmount * monthlyInterestRate / ( 1 - 1 / Math.pow ( 1 + monthlyInterestRate, numberOfYears * 12 ));

 double totalPayment = monthlyPayment * numberOfYears * 12;

 // Display Output

System.out.println( "The monthly payment is $" + (int) (monthlyPayment * 100) / 100.0);

System.out.println( "The total payment is $" + (int) (totalPayment * 100) / 100.0);
 

}

}