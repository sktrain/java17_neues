package ch06_api_ex_sol.solutions;

import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Beispielprogramm für die Workshops "Best of Java 11 - 17 / 18 / 19" und das
 * Buch "Java – Die Neuerungen in Version 17 LTS, 18 und 19"
 *
 * @author Michael Inden
 *         <p>
 *         Copyright 2021/22 by Michael Inden
 */
public class Exercise02b_Strings 
{
    public static void main(String[] args) 
    {
    	Function<Integer, String> mapper = num -> formatRightAligned(num, 10);
    	
    	Stream.of(2, 4, 7, 3, 1, 9, 5).map(mapper).
    	                               forEach(System.out::println);
    	
    	Stream.of(2, 4, 7, 3, 1, 9, 5).sorted().map(mapper).
                                                forEach(System.out::println);
    }
    
    private static String formatRightAligned(final int num, final int desiredLength)
    {
    	var multiNumbers = ("" + num).repeat(num);
    	
    	var padding = calcPadding(num, desiredLength);
    	
    	return "'" + padding + multiNumbers + "'";
    }
    
    private static String calcPadding(final int num, int desiredLength) 
    {
    	var padding = "";
    	if (num < desiredLength)
    	{
    		padding = " ".repeat(desiredLength - num);
    	}
    	
    	return padding;
    }
}