package ntu.basic.java;

public class FibonacciDemo {

	public static void main(String[] args) {

		int n = 3;
		System.out.println(fib(n));
		System.out.println(fib2(n));
		System.out.println(fibIter(n));
	}

	public static int fib(int n) {
		if (n > 1) {
			return fib(n - 1) + fib(n - 2);
		} else {
			return n;
		}
	}

	public static int fib2(int n) {
		if (n < 2) {
			return n;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}

	// loop 費式數列
	/**
	 * 0 1 1 2 3 5 8
	 * 
	 * @param n
	 * @return
	 */
	public static int fibIter(int n) {
		if (n < 2) {
			return n;
		} else {
			// 第一項，第二項
			int x = 0, y = 1;
			
			for (int i = 2; i <= n; i++) {
				// 第三項等於前兩項相加
				int z = x + y;
				// 數列往右偏移
				x = y;
				y = z;
			}
			// why not z? 我認為是z的scope只限loop裡
			return y;
		}
	}
}
