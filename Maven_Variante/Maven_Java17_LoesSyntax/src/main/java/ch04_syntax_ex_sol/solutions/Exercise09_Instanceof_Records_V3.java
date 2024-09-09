package ch04_syntax_ex_sol.solutions;

/**
 * Beispielprogramm für die Workshops "Best of Java 11 - 17 / 18 / 19" und das
 * Buch "Java – Die Neuerungen in Version 17 LTS, 18 und 19"
 *
 * @author Michael Inden
 *         <p>
 *         Copyright 2021/22 by Michael Inden
 */
public class Exercise09_Instanceof_Records_V3 
{
    // Verbesserung durch Anwenden von Polymorphie und Nutzen des Basistyps in der Signatur
    public double computeArea(final BaseFigure figure) 
    {
    	return figure.calcArea();
    }

    interface BaseFigure
    {
    	double calcArea();
    }
    
    record Square(double sideLength) implements BaseFigure {
    
    	@Override
    	public double calcArea() {
    		return sideLength * sideLength;
    	}
    }
    
    record Circle(double radius) implements BaseFigure 
    {
    	@Override
    	public double calcArea() 
    	{
    		return radius * radius * Math.PI;
    	}
    }
    
    // Rectangle
    record Rectangle(double width, double height) implements BaseFigure {
    
    	@Override
    	public double calcArea() {
    		return width * height;
    	}
    }
}
