package Week_2.Assignments;/*
 * Chapter 3 Self-Test 1
 * Write a program that reads characters from the keyboard until a period is received. 
 * Have the program count the number of spaces.
 * Report the total at the end of the program.
 */

class KeyBoardInput {
    public static void main(String[] args)
       throws java.io.IOException {
           char ch;
           int spaces = 0;
           System.out.print("Type a sentence which ends with a period(.): ");
           do {
               ch = (char) System.in.read();
               if (ch == ' ') spaces++;
           } while (ch != '.');

           System.out.println("The number of spaces is:" + spaces);
    }
}
