/**
 * 
 */
package week5;

/**
 * @author tiago
 *
 */
public class Ifs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Variables
		int number1 = 10;
		int number2 = 15;
		int number3 = 200;
		
		// if
		if (number1 < number2) {
			System.out.printf("Number %d is Greater than %d", number2, number1);
		}
		else {
			System.out.printf("Number %d is Greater than %d", number1, number2);
		}
		
		System.out.println("");
		
		// if else if
		if (number2 == number3) {
			System.out.println("Equal Numbers!");
		}
		else if (number1 == number3) {
			System.out.println("Equal Numbers!");
		}
		else if (number1 == number2) {
			System.out.println("Equal Numbers!");
		}
		else {
			System.out.println("NOT Equal Numbers!");
		}
		
		System.out.println("");
		
		//Nested if else
		boolean cold = true;
		boolean snowing = false;
		
		if (cold) {
			System.out.println("It's cold outside!");
			if (snowing) {
				System.out.println("It's snowing outside, wear a coat!");
			}
			else {
				System.out.println("But it's not snowing, so don't worry");
			}
		}
		else {
			System.out.println("It's hot outside!");
		}
		
		System.out.println("");
		
		// Switch
		String name = "Tiago";
		
		switch (name) {
		case "Sergio":System.out.println("Hi, Sergio");break;
		case "Bob":System.out.println("Hi, Bob");break;
		case "Tiago":System.out.println("Hi, Tiago! I finally found you!");break;
		default :System.out.println("You entered the wrong input!");
		}
	}

}
