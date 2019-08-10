package ntu.basic.java.exam;

public class Problem5 {

	public static boolean compareTo(String word) {
		String temp = "";
		
		for (int i= word.length(); i > 0; i--) {
			temp = temp + word.charAt(i-1); 
		}
		
		if(temp.equals(word))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args) {

		String word = "radar";
		System.out.println(compareTo(word));
		word = "abc";
		System.out.println(compareTo(word));
	}
	
}
