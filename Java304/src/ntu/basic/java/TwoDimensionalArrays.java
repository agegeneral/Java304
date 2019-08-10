package ntu.basic.java;

public class TwoDimensionalArrays {

	public static void printByForeach(int[][] M)
	{
		for(int[] row : M)
		{
			for(int element : row)
			{
				System.out.printf("%d, " , element);
			}
			System.out.printf("\n");
		}
	}
	
	public static void main(String[] args) {
		int[][] M = new int[3][4];
//		printByForeach(M);
		
		for(int i=0; i < M[0].length; i++)
		{
			int element = M[0][i];
			System.out.printf("%d, " , element);
		}

	}

}
