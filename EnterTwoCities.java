// write a program that prompts the user to enter two cities and displays them in
// alphabetical order

 import java.util.Scanner;
 public class EnterTwoCities {
   public static void main(String[] args) { 

   Scanner input = new Scanner(System.in);
   
  // prompt the user to enter the two cities

   System.out.print(" Enter city 1: ");
   String city1 = input.nextLine();

  System.out.print(" Enter city 2: ");
  String city2 = input.nextLine();

   if (city1.compareTo(city2) < 0) {
     System.out.println(" The cities in alphabetical order are " + city1 + " " + city2);

 } else {
     System.out.println(" The cities in alphabetical order are " + city2 + " " + city1);

 }

}
}