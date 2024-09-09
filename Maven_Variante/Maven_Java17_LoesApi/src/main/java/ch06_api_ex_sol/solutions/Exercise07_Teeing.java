package ch06_api_ex_sol.solutions;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Beispielprogramm für die Workshops "Best of Java 11 - 17 / 18 / 19" und das
 * Buch "Java – Die Neuerungen in Version 17 LTS, 18 und 19"
 *
 * @author Michael Inden
 *         <p>
 *         Copyright 2021/22 by Michael Inden
 */
public class Exercise07_Teeing 
{
    public static void main(String[] args) throws IOException 
    {        
    	// In einem Durchlauf Minimum und Maximm finden
    	Stream<String> values = Stream.of("CCC", "BB", "A", "DDDD");
    	List<String> optMinMax = values.collect(Collectors.teeing(
    			    Collectors.minBy(String::compareTo),
    			    Collectors.maxBy(String::compareTo),
    			    (optMin, optMax) -> List.of(optMin.orElse(""), 
    			                                optMax.orElse(""))));
    
    	System.out.println(optMinMax); 
    }
}
