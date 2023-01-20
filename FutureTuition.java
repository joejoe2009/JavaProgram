/* Write a program to determine the tuition for a university whose tuition is $10,000 this year and the tuition increases 7% every year. In how many years will the tuition be doubled? */


import java.util.Scanner;
   
   public class FutureTuition {
   /** Main method */
   public static void main(String[] args) { 
  
   double tuition = 10000;
   int year = 0;
   
   while (tuition < 20000) {
   tuition = tuition * 1.07;
   year++;
    
  } 

   System.out.println("The tuition will be doubled in " + year + " years ");
   System.out.printf("Tuition will be $%.2f in %1d years", tuition, year);
}
}

