package ntu.basic.java.exam;

import java.math.BigDecimal;

public class Problem1 {

	public static void main(String[] args) {

		BigDecimal bg = new BigDecimal("1.0");

		do {
			System.out.println(bg.doubleValue());
			bg = bg.subtract(new BigDecimal("0.1"));
		} while (bg.doubleValue() > 0);

		System.out.println("End of program.");
	}

}
