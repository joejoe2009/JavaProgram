/* (Game: multiply three numbers) The program in Listing 3.1, AdditionQuiz.java,
generates two integers and prompts the user to enter the product of these two integers. Revise the program to generate three single-digit integers and prompt the user
to enter the multiplication of these three integers.*/

import java.util.Scanner;
public class multiplyThreeNumbers {
  public static void main(String[] args) { 
  
  Scanner input = new Scanner(System.in);

  int singleDigit1 = (int)(Math.random() * 10 );
  int singleDigit2 = (int)(Math.random() * 10 );
  int singleDigit3 = (int)(Math.random() * 10 );

  System.out.print(
   "What is " + singleDigit1 + " * " + singleDigit2 + " * " + singleDigit3 + "? ");

  int answer = input.nextInt();

  System.out.println(
   singleDigit1 + " * " + singleDigit2 + " * " + singleDigit3 + " = " + answer + " is " +
   (singleDigit1 * singleDigit2 * singleDigit3 == answer));

  
}
}
