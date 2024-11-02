// CSCI 200 Sum of Primes project

import java.util.*;
class SumPrimes {
  public static int sumArray(int x, int y) {
	       // WRITE YOUR CODE HERE
    //create a sum variable to later return
    int sum = 0;
    //for everytime we have a prime number, we will add it to sum variable and store it in the variable
    for(int i = x; i <= y; i++){
      if(isPrime(i)){
        sum = sum + i;
      }
    }
    //return the sum
    return sum;
	}

  
  static boolean isPrime(int n) {
    //1 and 0 are not prime numbers so rule them out
    if(n == 1 || n == 0){
      return false;
      }
    //2 is a prime number and everything after find prime number
    for(int i = 2; i < n; i++){
      if(n % i == 0){
        return false;
      }
    }
    //return the prime numbers
    return true;
	}

  
  public static void main(String[] args) {
    //read in the integers
    Scanner scan = new Scanner(System.in);
    //declare 2 ints from scan
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    //find the prime numbers from between the 2 ints
    for(int i = num1; i <= num2; i++){
      isPrime(i);
    }
    //print out sum of prime numbers between 2 ints
    System.out.println(sumArray(num1, num2));
  }
}