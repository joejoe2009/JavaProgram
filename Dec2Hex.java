/* Write a program that prompts the user to enter a decimal number and converts it into a hex number as a string.*/

import java.util.Scanner;
   
   public class Dec2Hex {
   /** Main method */
   public static void main(String[] args) { 
 
   // create scanner
  Scanner input = new Scanner(System.in);

  // prompt user to enter a decimal number

  System.out.print("Enter decimal number: ");
  int decimal = input.nextInt();

  // converts decimal to hex

  String hex = "";

  while (decimal != 0) {
    int hexValue = decimal % 16;

  // convert decimal value to hex digit

  char hexDigit = (0 <= hexValue && hexValue <= 9) ? (char)(hexValue + 0) : (char)(hexValue - 10 + 'A');

  hex = hexDigit + hex;
  decimal = decimal / 16;
  
 }
    // display result
 System.out.println("The hex number is " + hex);
}

}


