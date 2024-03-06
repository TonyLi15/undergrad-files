package Week_2.Assignments;/*
 * Chapter 3 Self-Test 10
 * The ASCII lowercase letters are separated from the uppercase letters by 32. Thus, to convert a lowercase letter to uppercase, subtract 32 from it. 
 * Use this information to write a program that reads characters from the keyboard. 
 * Have it convert all lowercase letters to uppercase, and all uppercase letters to lowercase, displaying the result. 
 * Make no changes to any other character. 
 * Have the program stop when the user enters a period. 
 * At the end, have the program display the number of case changes that have taken place.
 */

public class LowerToUpper {
    public static void main (String[] args)
        throws java.io.IOException{
        char ch;
        int changes = 0;

        System.out.println("Type a sentence which ends with a period(.): ");
        do {
            ch = (char) System.in.read();
            if (ch >= 'a' & ch <= 'z'){
                ch -= 32;
                changes++;
            }
            else if (ch >= 'A' & ch <= 'Z'){
                ch += 32;
                changes++;
            }
            System.out.print(ch);
        } while(ch != '.');
        System.out.println(" ");
        System.out.println("Total number of case changes is: " + changes);
    }
}
