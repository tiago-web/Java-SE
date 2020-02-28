/**
 * 
 */
package week7;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/**
 * @author tiago
 *
 */
public class LoanQualifier {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Take salary as input
		double salary;
		double yearsWorked;
		double creditScore;
		boolean qualified = true;
		
		DecimalFormat percent = new DecimalFormat("#0.0%");
		
		salary = Double.parseDouble(JOptionPane.showInputDialog(null, "What is your salary?"));
		if (salary < 80000) {
			JOptionPane.showMessageDialog(null, "Your salary is too low to get a Loan.");
			qualified = false;
		} else {
			yearsWorked = Double.parseDouble(JOptionPane.showInputDialog(null, "How many years worked do you have?"));
			if (yearsWorked < 5){
				JOptionPane.showMessageDialog(null, "Sorry, you need to work for 5 years at least to get a Loan.");
				qualified = false;
			}
		}
		
		
		
		if (qualified) {
			do {
				creditScore = Double.parseDouble(JOptionPane.showInputDialog(null, "Please, enter your credit score: "));
				if (creditScore > 800 || creditScore < 0) {
					JOptionPane.showMessageDialog(null, "Credit Score must be below 800 or higher than 0.");
				}
				
			} while (creditScore > 800 || creditScore < 0);
			
			
			
			// Check credit
			if (creditScore <= 400) {
				JOptionPane.showMessageDialog(null, "Sorry, your credit score is too low.");
			} else {
				if (creditScore <= 800 && creditScore > 500) {
					double creditScorePerentage = 0.025;
					JOptionPane.showMessageDialog(null, String.format("You can get %s of credit score.", percent.format(creditScorePerentage)));
				} else if (creditScore <= 500 && creditScore >= 400) {
					double creditScorePerentage = 0.035;
					JOptionPane.showMessageDialog(null, String.format("You can get %s of credit score.", percent.format(creditScorePerentage)));
				}
			}
		}
	}

}
