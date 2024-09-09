package ch07_jvm.deprecations;

/**
 * Beispielprogramm für die Workshops "Best of Java 11 - 17 / 18 / 19" und das
 * Buch "Java – Die Neuerungen in Version 17 LTS, 18 und 19"
 *
 * @author Michael Inden
 *         <p>
 *         Copyright 2021/22 by Michael Inden
 */
public class PrimitiveCtorDeprecationExample {

	public static void main(String[] args) {
		Long myLong = new Long(1234L);
		
		Integer myInt = new Integer(1234);
	}
}