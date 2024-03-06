package Week_2.Assignments;/*
 * Chapter 3 Self-Test 9
 * The iteration expression in a for loop need not always alter the loop control variable by a fixed amount. 
 * Instead, the loop control variable can change in any arbitrary way. 
 * Using this concept, write a program that uses a for loop to generate and display the progression 1, 2, 4, 8, 16, 32, and so on.
 */

public class MoreForLoop {
    public static void main (String[] args){
        for(int i = 1; i <= 10000; i += i){
            System.out.println(i + " ");
        }
    }
}
