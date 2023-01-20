// Write a program that displays the first 50 prime numbers in 5 lines, each 
// containing 10 numbers (method).


public class PrimeNumberMethod {
  /** Main method */
  public static void main(String[] args) {  
   System.out.println("The first 50 prime number are \n");
   printPrimeNumbers(50);

}

public static void printPrimeNumbers(int numberOfPrimes) {
  final int NUMBER_OF_PRIME_PER_LINE = 10; // Display 10 per line
  int count = 0; // Count the number of prime numbers
  int number = 2; // A number to be tested for primeness

 // Repeatedly find prime numbers
  while (count < numberOfPrimes) {
   if (isPrime(number)) {
     count++;

   if (count % NUMBER_OF_PRIME_PER_LINE == 0) {
  // Print the number and advance to the new line
    System.out.printf("%-5d\n", number);
     } 
   else
    System.out.printf("%-5d", number);
   }
    // Check whether the next number is prime
    number++;
  }
}

public static boolean isPrime(int number) {
  for (int divisor = 2; divisor <= number / 2; divisor++){ 
    if (number % divisor == 0) { // If true, number is not prime
      return false; // Number is not a prime
   }
  }
      return true; // Number is prime
 }
}