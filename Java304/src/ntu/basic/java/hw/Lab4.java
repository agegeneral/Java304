package ntu.basic.java.hw;

public class Lab4 {

	/**
	 * 求x^n
	 * Let x be any real number and n be any integer (n can be negative). Write
	 * a program which calculates x ^ n by recursion. For example, 2 ^ -10 =
	 * 0.000976. Try to make your program run in O(log | n |) time. Note that
	 * you are not allowed to use Math.pow and any loop in your solution.
	 * 
	 */

	// loop求2^n
	public static int sqrLoop(int n) {
		int x = 1;
		for (int i = 0; i < n; i++) {
			// 上一次計算的結果 * 常數
			x = x * 2;
		}
		return x;
	}
	
	// Recursive求2^n
	public static int sqrRecursive(int n) {
		// 2^0 return 1
		// 2^1 return 2^0 * 2
		// 2^2 return 2^1 * 2
		// 2^3 return 2^2 * 2
		// 2^4 return 2^3 * 2
		if (n >= 1) {
			return sqrRecursive(n - 1) * 2;
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		// loop求2^10
		int n = 10;
		System.out.println(sqrLoop(n));

		// recursion 求2^10
		System.out.println(sqrRecursive(n));
	}

}
