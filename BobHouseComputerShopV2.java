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
public class BobHouseComputerShopV2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double advancePay;
		double profit;
		double finalSalary;
		double commition;
		
		double sales = Double.parseDouble(JOptionPane.showInputDialog(null, "How much did you sell this week?"));
		
		do {
			advancePay = Double.parseDouble(JOptionPane.showInputDialog(null, "How much did you get in advance?"));	
			if (advancePay > 1500) {
				JOptionPane.showMessageDialog(null, "Please, enter with a value smaller than $1,500");
			}
		} while (advancePay > 1500);
		
		
		
		if (sales < 10000) {
			profit = sales * 0.05;
			commition = 0.05;
		} 
		else if (sales >= 10000 && sales < 15000) {
			profit = sales * 0.1;
			commition = 0.10;
		} 
		else if (sales >= 15000 && sales < 18000) {
			profit = sales * 0.12;
			commition = 0.12;
		}
		else if (sales >= 18000 && sales < 22000) {
			profit = sales * 0.15;
			commition = 0.15;
		}
		else {
			profit = sales * 0.16;
			commition = 0.16;
		}
		
		finalSalary = profit - advancePay;
		
		DecimalFormat dollar = new DecimalFormat("$#,##0.00");
		
		DecimalFormat percent = new DecimalFormat("#0%");
		
		if (finalSalary < 0) {
			JOptionPane.showMessageDialog(null, String.format("Your commition was %s and you have a debit of:  %s", percent.format(commition),  dollar.format(finalSalary)));
		} else {
			JOptionPane.showMessageDialog(null, String.format("Your commition was %s and you still have: %s extra for this month!", percent.format(commition), dollar.format(finalSalary)));
		}
	}

}
