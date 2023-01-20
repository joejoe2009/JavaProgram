// writes a program that lets the user enter a year and checks whether it is a leap 


import java.util.Scanner;
public class LeapYear {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  System.out.print(" Enter a Year: ");
  int year = input.nextInt();

  boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

 System.out.println( year  +  " is a leap year? " + isLeapYear);

}
}