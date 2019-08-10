package ntu.basic.java.exam;

public class Problem3 {

	public static void main(String[] args) {
		int a = 8;
		int b = 12;
		int range = (a + b) / 2;
		
		int gcd = 0;
		for (int i = 1; i <= range ; i++) {
			if (a % i == 0 && b % i == 0) {
				gcd = i;
			}
		}
		System.out.println(gcd);
	}

}
