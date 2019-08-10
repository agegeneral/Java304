package ntu.basic.java;

public class Array {

	public static int[] genArray(int length, int range) {
		int[] A = new int[length];

		for (int i = 0; i < A.length; i++) {
			// random
			A[i] = (int) (Math.random() * range + 1);
		}
		return A;
	}

	public static void printArray(int[] A) {
		for (int i = 0; i < A.length; i++) {
			System.out.printf("%2d", A[i]);

			if (i != (A.length - 1)) {
				System.out.print(", ");
			}
		}
	}
	
	public static void print2dArray(int[][] A) {
		
		for(int i=0; i < A.length; i++)
		{
			printArray(A[i]);
			System.out.printf("%s", "\n");
		}
	}

	public static int[][] gen2dArray()
	{
		// new 2d array
		int row = 3;
		int col = 4;
		int[][] M = new int[row][col];

		for(int i=0; i < M.length; i++)
		{
			// gen 1 row
			// random element
			M[i] = genArray(3, 50);
		}
		
		return M;
	}
	
	public static void main(String[] args) {
		// System.out.println(genArray(3));
		int[] a = genArray(5, 20);
//		printArray(a);
		print2dArray(gen2dArray());
	}

}
