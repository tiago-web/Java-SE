/**
 * 
 */
package week2;

/**
 * @author tiago
 *
 */
public class BobTaxCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// This program will calculate Non taxes
		// Declare values
		double taxRate = 0.26;
		double bobSalary = 120000;
		double taxOwed = taxRate * bobSalary;
		double finalSalary = bobSalary - taxOwed;
		
		// Output
		System.out.println("Bob owes $"+taxOwed+" in taxes and " + "Bob's take home pay is $"+finalSalary);

	}

}
