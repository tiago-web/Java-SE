/**
 * 
 */
package week7;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 * @author tiago
 *
 */
public class SelfStudy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// This is a self-study class
		double CAD = 0.30;
		double USD = 0.23;
		double Real;
		double conversion = 0;
		String user = "Tiago";
		String password = "12345";
		boolean access = false;
		
		DecimalFormat currency = new DecimalFormat("0.00");
		DecimalFormat money = new DecimalFormat("$#,###,##0.00");
		Scanner keyboard = new Scanner(System.in);
		
		String usernameInput = JOptionPane.showInputDialog(null, "Please enter your username:");
		
		if (user.equalsIgnoreCase(usernameInput)) {
			String userpasswordInput = JOptionPane.showInputDialog(null, "Please enter your password:");
			if(password.equalsIgnoreCase(userpasswordInput)) {
				access = true;
			} else {
				System.out.println("wrong password");
			}
		} else {
			System.out.println("wrong username");
		}

		
		
		
		if (access) {
			String userChoosenCurrency = JOptionPane.showInputDialog(null, "Do you want to convert to 1.USD or 2.CAD?");
			
			switch (userChoosenCurrency) {
			case "1":
				System.out.println(String.format("The USD currency is: %s.", currency.format(USD)));
				System.out.println("Please enter with the amount of Reais you want to convert to USD dollars:");
				Real = keyboard.nextDouble();
				conversion = Real * USD;
				break;
			case "2":
				System.out.println(String.format("The CAD currency is: %s.", currency.format(CAD)));
				System.out.println("Please enter with the amount of Reais you want to convert to CAD dollars:");
				Real = keyboard.nextDouble();
				conversion = Real * CAD;
				break;
			default:
				System.out.println("You did not choose any currency!");
			}
			
			
			
			String askToConvert = JOptionPane.showInputDialog(null, "Are you sure that you want to convert?");
			char answer = askToConvert.charAt(0);
			
			if (answer == 'y' || answer == 'Y') {
				JOptionPane.showMessageDialog(null, String.format("The conversion was %s.", money.format(conversion)));
			} else {
				JOptionPane.showMessageDialog(null, "Your money was not converted!");
			}
		}
		
		keyboard.close();
		System.exit(0);
	}

}
