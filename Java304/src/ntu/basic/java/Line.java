package ntu.basic.java;

public class Line {
	private Point head, tail;

	public Line(Point head, Point tail) {
		this.head = head;
		this.tail = tail;
	}

	public double getLength() {
		return head.getDistanceFrom(tail);
	}

}
