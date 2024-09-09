package ch04_syntax_ex_sol.exercises;

import java.time.LocalDate;

/**
 * Beispielprogramm für die Workshops "Best of Java 11 - 17 / 18 / 19" und das
 * Buch "Java – Die Neuerungen in Version 17 LTS, 18 und 19"
 *
 * @author Michael Inden
 *         <p>
 *         Copyright 2021/22 by Michael Inden
 */
public class Exercise07_RecordAndTextblock {

	record Person(String firstName, String lastName, LocalDate birthday) {}
	
	public static void main(String[] args) 
	{
		Person mike = new Person("Michael", "Inden", LocalDate.of(1971, 2, 7)); 
		
		System.out.println(mike);
		//System.out.println(mike.toXml());
		//System.out.println(mike.toJSON());
	}
}
