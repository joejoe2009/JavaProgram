// program that prompts the user to enter an integer. If the number is a multiple of 5, the program displays // HiFive. If the number is divisible by 2, it displays HiEven

  import java.util.Scanner;
 
   public class SimpleIfDemo {
   public static void main(String[] args) {
   
   Scanner input = new Scanner(System.in);

   System.out.print( "Enter an integer:  ");
   int number = input.nextInt();

  
  if (number % 5 == 0 ) {
  System.out.println (" HiEven ");
 }

   if (number % 2 == 0 ) {
  System.out.println (" HiFive ");
 }



 }
}
