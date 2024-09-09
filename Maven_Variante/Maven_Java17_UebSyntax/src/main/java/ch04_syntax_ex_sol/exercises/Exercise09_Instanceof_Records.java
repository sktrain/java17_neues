package ch04_syntax_ex_sol.exercises;

/**
 * Beispielprogramm für die Workshops "Best of Java 11 - 17 / 18 / 19" und das
 * Buch "Java – Die Neuerungen in Version 17 LTS, 18 und 19"
 *
 * @author Michael Inden
 *         <p>
 *         Copyright 2021/22 by Michael Inden
 */
public class Exercise09_Instanceof_Records 
{
	record Square(double sideLength) {
	}
	
	record Circle(double radius) {
	}
	
	public double computeAreaOld(final Object figure) 
	{
		if (figure instanceof Square) 
		{
			final Square square = (Square) figure;
			return square.sideLength * square.sideLength;
		} 
		else if (figure instanceof Circle) 
		{
			final Circle circle = (Circle) figure;
			return circle.radius * circle.radius * Math.PI;
		}
		throw new IllegalArgumentException("figure is not a recognized figure");
	}

}
