// Write a program to demonstrate the effect of using break in a loop.


import java.util.Scanner;
   
   public class TestBreak {
   /** Main method */
   public static void main(String[] args) {  
   int sum = 0;
   int number = 0;
  
   while (number < 20) {
    number++;
    sum += number;
      // if (sum >= 100) 
        // break;
    }

   System.out.print("The number is " +number);
   System.out.print("\n" + "The sum is " +sum);

  }
}