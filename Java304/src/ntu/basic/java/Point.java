package ntu.basic.java;

public class Point {

	// data members
	private double x, y;

	// function members

	public Point() {
		// default constructor
	}

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double a) {
		x = a;
	}

	public double getY() {
		return y;
	}

	public void setY(double a) {
		y = a;
	}

	public double getDistanceFrom(Point that) {
		return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
	}

	// static member
	public static double measure(Point first, Point second) {
		return Math.sqrt(Math.pow(first.x - second.x, 2) + Math.pow(first.y - second.y, 2));
	}

	// override
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}
