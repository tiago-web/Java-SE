package week5;
import java.util.Scanner;

/**
 * @author tiago
 *
 */
public class BobCurrencyCalv2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double USD;
		double CAD;
		System.out.println("Enter CAD currency:");
		Scanner keyboard = new Scanner(System.in);
		CAD = keyboard.nextDouble();
		
		System.out.println("How much USD do you want to convert?");
		USD = keyboard.nextDouble();
		double value = USD * CAD;
		
		System.out.println("USD$"+ USD + " is equal to CAD$"+ value);
		
		keyboard.close();
		System.exit(0);

	}

}
