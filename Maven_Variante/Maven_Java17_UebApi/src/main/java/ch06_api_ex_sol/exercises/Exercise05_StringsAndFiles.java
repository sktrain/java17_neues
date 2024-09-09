package ch06_api_ex_sol.exercises;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

/**
 * Beispielprogramm für die Workshops "Best of Java 11 - 17 / 18 / 19" und das
 * Buch "Java – Die Neuerungen in Version 17 LTS, 18 und 19"
 *
 * @author Michael Inden
 *         <p>
 *         Copyright 2021/22 by Michael Inden
 */
public class Exercise05_StringsAndFiles 
{
	public static void main(String[] args) throws IOException 
	{
		final Path filePath = Paths.get("test.txt");
		
		// TODO
				
		final List<String> allLines = Collections.emptyList(); // TODO;
		allLines.forEach(System.out::println);
	}
}
