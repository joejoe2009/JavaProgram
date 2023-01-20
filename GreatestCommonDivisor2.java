//Write a program that prompts the user to enter two positive integers and
//finds their greatest common divisor using method


import java.util.Scanner;

public class GreatestCommonDivisor2 {
   /** Main method */
   public static void main(String[] args) { 

   //create Scanner
   Scanner input = new Scanner(System.in);

  //prompts user to enter two positive integers
  System.out.print("Enter the first integer: ");
  int n1 = input.nextInt();
  System.out.print("Enter the second integer: ");
  int n2 = input.nextInt();

 //display result
  System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd(n1, n2));

}

public static int gcd(int n1, int n2) {
  int gcd = 1; // initialize gcd
  int k = 2; // possible gcd

   while (k <= n1 && k <= n2) {
     if ( n1 % k == 0 && n2 % k == 0)
       gcd = k; // update gcd
     k++;
 
  }
   return gcd;
 }
}