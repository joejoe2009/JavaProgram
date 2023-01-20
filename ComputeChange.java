import java.util.Scanner;
public class ComputeChange {
  public static void main(String[] args) { 

  Scanner input = new Scanner(System.in);
  
  System.out.print( " Enter the amount as a decimal number, e.g., 11.56:  ");
  double amount = input.nextDouble();
  int remainingAmount = (int)(amount * 100);

  // find number of dollar
     int numberOfOneDollars = remainingAmount / 100;
     remainingAmount = remainingAmount % 100;

  // find number of Quarter
     int numberOfQuarters = remainingAmount / 25;
     remainingAmount = remainingAmount % 25;

  //find number of dimes
    int numberOfDimes = remainingAmount / 10;
    remainingAmount = remainingAmount % 10;

  // find number of nickels
    int numberOfNickels = remainingAmount / 5;
    remainingAmount = remainingAmount % 5;

  // find number of pennies
    int numberOfPennies = remainingAmount;

   // Display Result
   System.out.println("Your amount " + amount + " consists of");
   System.out.println(" " + numberOfOneDollars + " dollars");
   System.out.println(" " + numberOfQuarters + " quarters ");
   System.out.println(" " + numberOfDimes + " dimes");
   System.out.println(" " + numberOfNickels + " nickels");
   System.out.println(" " + numberOfPennies + " pennies");

}
}