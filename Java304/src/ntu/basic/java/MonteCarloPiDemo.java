package ntu.basic.java;

public class MonteCarloPiDemo {

	public static void main(String[] args) {
		
		int N = 10000;	// 方形面積
		int m = 0;		// 圓面積
		
		for(int i = 1; i <= N; i++){
			double x = Math.random();
			double y = Math.random();
			
			// x^2 + y^2 < 1 圓方程式移項
			if(x * x + y * y < 1){
				m++;
			}
		}
		
		System.out.println(4.0 * m / N);
	}

}
