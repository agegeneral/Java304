package ntu.basic.java;

public class StackOverFlowDemo {
	
	public static void crach_me(int n) {
		System.out.println(n);
		crach_me(n + 1);
	}
	
	public static void main(String[] args) {
		crach_me(1);
	}
}
