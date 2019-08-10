package ntu.basic.java;

public class PointDemo {

	public static void main(String[] args) {

		Point p1 = new Point();
		p1.setX(3);
		p1.setY(4);
		System.out.printf("p1 = (%.2f, %.2f)\n", p1.getX(), p1.getY());
		
		Point p2 = new Point();
		p2.setX(10);
		p2.setY(-10);;
		System.out.printf("p2 = (%.2f, %.2f)\n", p2.getX(), p2.getY());
		System.out.println(p1);
		
		// 求兩點距離
		double distance = Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + 
						  Math.pow(p1.getY() - p2.getY(), 2));
		System.out.println(distance);
		System.out.println(p1.getDistanceFrom(p2));
		System.out.println(Point.measure(p1, p2));
	}

}
