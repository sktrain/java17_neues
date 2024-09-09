package ch04_syntax_ex_sol.exercises;

/**
 * Beispielprogramm für die Workshops "Best of Java 11 - 17 / 18 / 19" und das
 * Buch "Java – Die Neuerungen in Version 17 LTS, 18 und 19"
 *
 * @author Michael Inden
 *         <p>
 *         Copyright 2021/22 by Michael Inden
 */
public class Exercise06_Records 
{
	class Square 
	{
		public final double sideLength;
	
		public Square(final double sideLength) 
		{
			this.sideLength = sideLength;
		}
	}
	
	class Circle 
	{
		public final double radius;
	
		public Circle(final double radius) 
		{
			this.radius = radius;
		}
	}
}
