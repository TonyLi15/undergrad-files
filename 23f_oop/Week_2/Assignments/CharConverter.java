package Week_2.Assignments;/*
 * Chapter 4
 * Create a class called CharConverter that has the following three methods.
 * 
 * char convert(char c)
 * which does the same conversion introduced in Chapter 3 Self Test #10.
 * 
 * char getLastConversion()
 * which returns the char resulted from the last execution of convert() method.
 * 
 * int getNumberOfConversion()
 * which returns the number of conversion conducted after the instance is created.
 * 
 * Then create the public static void main(String[] args) method inside the CharConverter class.
 * In the main() method, create an instance of CharConverter, and add lines of code using these three methods as you like. 
 * Check your program runs correctly. 
 * 
 * Submit the content of CharConverter class.
 */


public class CharConverter {
    char lastConversionResult;
    int numberOfConversion;

    char convert(char ch){
        if (ch >= 'A' && ch <= 'Z'){
            ch += 32;
        } else if (ch >= 'a' && ch <= 'z'){
            ch -= 32;
        }
        lastConversionResult = ch;
        numberOfConversion++;
        return lastConversionResult;
    }

    char getLastConversion(){
        return lastConversionResult;
    }

    int getNumberOfConversion(){
        return numberOfConversion;
    }

    void print_test(char convertedChar){
        System.out.println("The converted char is: " + convertedChar);
        System.out.println("The last conversion result is: " + getLastConversion());
        System.out.println("The number of conversion is: " + getNumberOfConversion());
    }

    public static void main(String[] args){
        CharConverter charConverter = new CharConverter();
        char convertedChar = charConverter.convert('a');
        charConverter.print_test(convertedChar);

        convertedChar = charConverter.convert('A');
        charConverter.print_test(convertedChar);

        convertedChar = charConverter.convert('1');
        charConverter.print_test(convertedChar);

        convertedChar = charConverter.convert('z');
        charConverter.print_test(convertedChar);
        
    }
}
