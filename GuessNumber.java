//write a program that prompts the user to enter a number continuously until the number matches the randomly //generated number

import java.util.Scanner;
public class GuessNumber {
  public static void main(String[] args) { 
  
  int number = (int)(Math.random() * 101);

  Scanner input = new Scanner(System.in);
  
  System.out.print("Enter a magic number between 0 and 100: ");
  
  int guessNumber = -1;
  while (guessNumber != number) {
  System.out.print("Enter your guess: ");
  guessNumber = input.nextInt();

  if (guessNumber == number) 
  System.out.print("Yes, the number is " + number);

  else if (guessNumber > number)
  System.out.print("Your guess is too high ");

  else
  System.out.println("Your guess is too low ");

  } 
 }
}