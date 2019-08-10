package ntu.basic.java.exam;

public class Problem2 {

	public static void main(String[] args) {

		int x = 123456;
		int digitSum = 0;

		do {
			digitSum = x % 10 + digitSum;
			x = x / 10;
		} while(x != 0);

		System.out.println(digitSum);
	}

}
