package ch06_api_ex_sol.solutions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

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
    	
    	Files.writeString(filePath, "1: One\n");
    	Files.writeString(filePath, "2: Two\n", StandardOpenOption.APPEND);
    	Files.writeString(filePath, "3: Three", StandardOpenOption.APPEND);
    	
    	final String content = Files.readString(filePath);
    	
    	final List<String> allLines = content.lines().collect(Collectors.toList());
    	allLines.forEach(System.out::println);
    	
    	// Mit Text Blocks als neues Feature
    	Files.writeString(filePath, """
    	1: One
    	2: Two
    	3: Three
    	""");
    	
    	final String content2 = Files.readString(filePath);
        
        final List<String> allLines2 = content.lines().collect(Collectors.toList());
        allLines2.forEach(System.out::println);
    }
}
