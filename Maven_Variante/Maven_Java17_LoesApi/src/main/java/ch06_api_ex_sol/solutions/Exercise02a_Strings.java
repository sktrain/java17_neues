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
public class Exercise02a_Strings 
{
    public static void main(String[] args) 
    {
    	Function<Integer, String> mapper = num -> ("" + num).repeat(num);
    	
    	Stream.of(2, 4, 7, 3, 1, 9, 5).map(mapper).
    	                               forEach(System.out::println);	     
    }	
}