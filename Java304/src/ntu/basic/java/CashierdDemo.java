package ntu.basic.java;
import java.util.Scanner;

public class CashierdDemo {

	public static void main(String[] args) {

		int total = 0, price = 0;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter price?");
		price = input.nextInt();
		while (price > 0) {
			total += price;
			System.out.println("Enter price?");
			price = input.nextInt();
			// These two lines above repeat Line 5 and 6?!
		}

		System.out.println("Total = " + total);
		input.close();
	}

}
