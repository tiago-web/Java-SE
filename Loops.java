/**
 * 
 */
package week6;

/**
 * @author tiago
 *
 */
public class Loops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create an example for each loop
		
		boolean bob = true;
		int age = 1;
		int number = 0;
		
		while (bob) {
			System.out.println("Bob is " + age + " years old");
			age++;
			if (age >= 6) // If this condition is true. Then, the break will be executed
				break; // Exit
		}
		
		System.out.println("--------------------------");
		
		int a = 0;
		
		while (a < 10) { 
			if (a == 5) {
				a++;
				continue; // The continue will skip the 5 in this case because of the if condition
			}
			System.out.println("Increasing 1 but skipping 5 == " + a);
			a++;	
		}
		
		
		System.out.println("--------------------------");
		
		do {
			System.out.println(number);
			number++;
		} while (number < 10); // Continue as long as this condition is not reached
		
		System.out.println("--------------------------");
		
		boolean today = true;
		
		do {
			System.out.println("today is true.");
			today = false;
		} while (today); // Continue as long as today is false. Therefore, in this case the loop will run only once

		System.out.println("Now today is FALSE! So, I'm out of the loop.");
		
		System.out.println("--------------------------");
		
		
		for(var i= 0; i<11; i++) { // Continue as many times as I want (in this case 11 times)
			System.out.println(i + " + " + i + " = " + (i+i));
		}
		
		for(var i= 1; i<=10; i++) { // This will run once, and then the inner loop will be executed completely
			System.out.println("=============== Table of "+ i + " ===============");
			for(var b= 0; b<10; b++) {
				System.out.println(i + " x " + b + " = " + (i*b));
			}
		} 
		
		
	}

}
