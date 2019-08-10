package ntu.basic.java;
import java.util.Scanner;

public class ComputeArea {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter r?");
		int r = input.nextInt();

		// input
		if(r > 0)
		{
			// algorithm
			double A = r * r * 3.14;
			System.out.println(A);
		}
		else
		{
			System.out.println("r <= 0.");
		}
		// output
		input.close();
	}
}
