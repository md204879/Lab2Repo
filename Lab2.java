import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Ask the user to enter a number between 1 and 100
		System.out.print("Please enter a number between 1 and 100");
		int num = input.nextInt();

		// verify that what the user entered is a valid number between 1 and 100
		if (num >= 1 && num <= 100) {

			// Check if the num is even or odd
			if (num % 2 == 0) {
				// Check different conditions for even
				if (num > 2 && num < 25) {
					System.out.println("The number is Even and less then 25");
				}
				if (num >= 26 && num <= 60) {
					System.out.println("The number is Even");
				}
				if (num > 60) {
					System.out.println(num + " " + "is Even");
				}
			} else {
				System.out.println(num + " " + "is Odd");
				// Check different conditions for odd
				if (num > 60) {
					System.out.println(num + " " + "is Odd and over 60");
				}
			}

		} else {
			System.out.print("Please enter a valid number between 1 and 100");
		}
		input.close();
	}

}