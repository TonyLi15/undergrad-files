package Week_2.Answers;

public class CharConverter {
	// No constructor is explicitly defined. In such the case, Java VM automatically generate a null constructor that does nothing.
	char converted;
	int count = 0;
	
	/**
	 * which does the same conversion introduced in Chapter 3 Self Test #10.
	 * @return
	 */
	char convert(char c) {
		converted = c;
		if('A' <= c && c <= 'Z') {
			converted += 32;
		}else if('a' <= c && c <= 'z') {
			converted -= 32;
		}
		count++;
		
		return converted;
	}

	/**
	 * which returns the char resulted from the last execution of convert() method.
	 * @return
	 */
	char getLastConversion() {
		return converted;
	}

	/**
	 * which returns the number of conversion conducted after the instance is created.
	 * @return
	 */
	int getNumberOfConversion() {
		return count;
	}
	
	public static void main(String[] args) {
		// create an instance of CharConverter class using new.
		// then store the instance in the cc variable.
		CharConverter cc = new CharConverter();
		
		for(char c='a'; c <= 'z'; c++) {
			// acquire the result of the previous conversion
			// by invoking getLastConversion method of 
			// the CharConverter instance stored in the cc variable.
			// then print it.
			System.out.println("The previous conversion was "+cc.getLastConversion());

			// do conversion for the current c
			char converted = cc.convert(c);

			// print the result of this conversion
			System.out.println(c+" is converted to "+converted);
		}
		
		// print the number of conversions
		System.out.println(cc.getNumberOfConversion()+" conversion occured.");
	}
}
