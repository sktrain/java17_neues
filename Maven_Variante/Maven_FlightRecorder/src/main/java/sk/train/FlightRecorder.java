package sk.train;

import java.util.ArrayList;
import java.util.List;

public class FlightRecorder {

	public static void main(String[] args) {
		
		List<Object> items = new ArrayList<>(1);
		
		try {
			while (true) {
				items.add(new Object());
			}
		} catch (OutOfMemoryError e) {
			System.out.println("Meldung: " + e.getMessage());
		}
		
		assert items.size() > 0;
		
		try {
			Thread.sleep(1000);
			System.err.println("Hi");
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
