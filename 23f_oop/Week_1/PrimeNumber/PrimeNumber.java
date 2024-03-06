package Week_1.PrimeNumber;/*
 * Chapter 2 Self-Test 10
 * Write a program that prints all of the prime numbers between 2 and 100.
 */

class PrimeNumber {
    public static void main (String[] args){
        int i, j;
        boolean isprime;

        for(i = 2; i < 100; i++){
            isprime = true;

            for(j = 2; j <= i/j; j++){
                if((i % j) == 0) isprime = false;
            }

            if(isprime) System.out.println(i + " is prime number");
        }
    }
}
