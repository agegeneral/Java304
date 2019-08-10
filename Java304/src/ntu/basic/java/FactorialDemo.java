package ntu.basic.java;


public class FactorialDemo {
	
	// find factorial by recursion
	public static int factorial(int n)
	{
		if(n > 1)
		{
			return n * factorial(n - 1);
		}
		else
		{
			// 0! = 1
			return 1;
		}
	}
	
	// find factorial by loop
	public static int factorialLoop(int n)
	{
		/*
		 * 4! n = n * (n - 1) * (n - 2) * (n - 3);
		 * 5! n = n * (n - 1) * (n - 2) * (n - 3) * (n - 4);
		 * 6! n = n * (n - 1) * (n - 2) * (n - 3) * (n - 4) * (n - 5);
		 */
		
		int result = n;
		int y = 0;
		for(int i = 1; i < n; i++)
		{
			y = n - i;
			result = result * y;
		}
		return result;
	}
	
	public static int factorialLoop2(int n)
	{
		int s = 1;
		for (int i = 2; i <= n; i++) 
		{
			if(i == 34)
			{
				System.out.println("s= " + s);
				System.out.println("i=" + i);
			}
			s = s * i;
		}
		return s;
	}
	public static void main(String[] args) {
		/*
		 * n! = n * (n − 1)!
		 * f(n) = n * f(n − 1)
		 */
		int n = 40;
		System.out.println(factorial(n));
		System.out.println(factorialLoop(n));
		System.out.println(factorialLoop2(n));
		
		// when n = 34 , s = -2147483648, 
		// then s = s * i, 
		// s = -2147483648 * 34 = -73014444032
		// know int range: 2147483647 ~ -2147483648
		
		int x = -2147483648;
		System.out.println("x=" + (x * 34));
	}
}
