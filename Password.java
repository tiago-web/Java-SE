/**
 * 
 */
package week5;
import java.util.Scanner;

/**
 * @author tiago
 *
 */
public class Password {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// If the user enters the correct password then print access granted else access denied.
		String password = "12345";
		String inputed_password;
		
		System.out.println("Enter the password");
		Scanner keyboard = new Scanner(System.in);
		inputed_password = keyboard.next();
		
		if (inputed_password.equals(password))
		{
			System.out.println("Your password is right!");
		}
		else {
			System.out.println("You have entered the wrong password!");
		}
		
		keyboard.close();
		System.exit(0);
	}

}
