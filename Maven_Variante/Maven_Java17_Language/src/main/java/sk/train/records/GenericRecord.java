package sk.train.records;

import java.util.Comparator;

public record GenericRecord(Comparable<Point> c1, Comparable<Point> c2) implements Comparator<Point>{

	@Override
	public int compare(Point o1, Point o2) {
		return (o1.x() + o1.y()) - (o2.x() + o2.y());
	}

	public static void main(String[] args) {
		Point c1 = new Point(1,1);
		Point c2 = new Point(2,2);
		
		var genericRecord = new GenericRecord( c1, c2);
		System.out.println(genericRecord.compare(c1, c2));
		
	}

}
