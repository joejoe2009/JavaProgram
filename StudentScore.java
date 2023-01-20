/* (Pass or fail) Write a program that prompts a student to enter a Java score. If the
score is greater or equal to 60, display you pass the exam, otherwise, display you
dont pass the exam. Your program ends with input -1. Here is a sample run: */


import java.util.Scanner;
 
   public class StudentScore {
   /** Main method */
   public static void main(String[] args) { 
    
   Scanner input = new Scanner(System.in);

   System.out.print("Enter Your Score: ");
   int score = input.nextInt();

   if (score >= 60) {
   
   System.out.println("You pass the exam");

  }
   else 
    System.out.println("you don't pass the exam");
 }
} 

