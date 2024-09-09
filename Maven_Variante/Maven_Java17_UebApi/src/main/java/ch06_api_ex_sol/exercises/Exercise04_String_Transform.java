package ch06_api_ex_sol.exercises;

import java.util.Arrays;

/**
 * Beispielprogramm für die Workshops "Best of Java 11 - 17 / 18 / 19" und das
 * Buch "Java – Die Neuerungen in Version 17 LTS, 18 und 19"
 *
 * @author Michael Inden
 *         <p>
 *         Copyright 2021/22 by Michael Inden
 */
public class Exercise04_String_Transform
{
	public static void main(String[] args) {
		
		var csvText = "HELLO,WORKSHOP,PARTICIPANTS,!,LET'S,HAVE,FUN";
		
		// Aufgabe 4a
		var allLowerCaseNoCommas = csvText.transform(String::toLowerCase)
				                          .transform(str -> str.replace(",", " "));
		System.out.println(allLowerCaseNoCommas);

		
		// Aufgabe 4b
		var asSingleValues = csvText.transform(String::toLowerCase)
				                    .transform(str -> str.contains("hello") ? str.replace("hello", "GRÜEZI") : str)
                                    .transform(str -> str.split(","));
		System.out.println(Arrays.asList(asSingleValues));	
	}
}
