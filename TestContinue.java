// Write a program to demonstrate the effect of using continue in a loop.


import java.util.Scanner;
   
   public class TestContinue {
   /** Main method */
   public static void main(String[] args) {  
   int sum = 0;
   int number = 0;
  
   while (number < 20) {
    number++;
    // if (number == 10 || number == 11)
      // continue;
    sum += number;
      
    }

   System.out.print("\n" + "The sum is " +sum);

  }
}