/**
 * 
 */
package week5;
import javax.swing.JOptionPane;

/**
 * @author tiago
 *
 */
public class BobCurrencyCalv3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Modify your existing program
		 * Use a nested if-else to check the user's username and password 
		 * Ask the user to choose between two currencies
		 * the user will only see the output from the option that they have selected.
		 * Use dialog box for input and output.
		 * Use if, if-else if and switch in your program in any way
		 */
		
		String username = "Tiago";
		String password = "12345";
		String inputed_username;
		String inputed_password;
		boolean access = false;
		double USD = 1;
		double CAD = 1.33;
		String currency;
		String amount_str;
		double amount;
		double total;
		
		inputed_username = JOptionPane.showInputDialog("User Name:");
		inputed_password = JOptionPane.showInputDialog("Password:");
		
		if (username.equalsIgnoreCase(inputed_username)){
			if(password.equals(inputed_password)) {
				 access = true;
			}
			else {
				JOptionPane.showMessageDialog(null, "You have entered the wrong password!");
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "You have entered the wrong username!");
		}
		
		if (access) {
			currency = JOptionPane.showInputDialog("Please enter the currency that you want to know 1.USD or 2.CAD");
			
			switch (currency) {
			case "2":
				JOptionPane.showMessageDialog(null, "The currency for CAD is " + CAD);
				amount_str = JOptionPane.showInputDialog("Please, enter the amount that you want to convert");
				amount = Double.parseDouble(amount_str); // Convert string to double
				
				total = amount * CAD;
				JOptionPane.showMessageDialog(null, "The conversion will be: " + total);
				break;
			case "1":
				JOptionPane.showMessageDialog(null, "The currency for USD is " + USD);
				amount_str = JOptionPane.showInputDialog("Please, enter the amount that you want to convert");
				amount = Double.parseDouble(amount_str); // Convert string to double
				
				total = amount * USD;
				JOptionPane.showMessageDialog(null, "The conversion will be: " + total);
				
				break;
			default:JOptionPane.showMessageDialog(null, "You have entered the wrong input!");
			}
		}
		
		System.exit(0);
		
	}

}
