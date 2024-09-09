package ch04_syntax_ex_sol.solutions;

/**
 * Beispielprogramm für die Workshops "Best of Java 11 - 17 / 18 / 19" und das
 * Buch "Java – Die Neuerungen in Version 17 LTS, 18 und 19"
 *
 * @author Michael Inden
 *         <p>
 *         Copyright 2021/22 by Michael Inden
 */
public class Exercise09_Instanceof_Records_V1 
{
	// Verbesserung ohne Cast, aber instancoef verstösst gegen Open Closed
	public double computeArea(final Object figure)
	{
		if (figure instanceof Square square)
		{
			return square.sideLength * square.sideLength;
		}
		else if (figure instanceof Circle circle)
		{
			return circle.radius * circle.radius * Math.PI;
		}
		throw new IllegalArgumentException("figure is not a recognized figure");
	}

	record Square(double sideLength) {
	}

	record Circle(double radius) {
	}
}
