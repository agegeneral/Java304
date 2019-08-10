package ntu.basic.java;

public class NumbericError {

	public static void main(String[] args)
	{
		double x = 0.0000000000000003;
		//x = 0.1;
		double y = 0.2;
		y = 0.0000000000000005;
		System.out.println(x);
		System.out.println(y);
		System.out.println(y - x);
		
		char c ='a';
		c = (char) (c + 1);
		System.out.println(c);
		c += 1;
		System.out.println(c);
		// why not case? ��function call �Ӭ�
	}
}
