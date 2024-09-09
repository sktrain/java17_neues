package ch06_api_ex_sol.solutions;

import java.text.NumberFormat;
import java.text.NumberFormat.Style;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;

/**
 * Beispielprogramm für die Workshops "Best of Java 11 - 17 / 18 / 19" und das
 * Buch "Java – Die Neuerungen in Version 17 LTS, 18 und 19"
 *
 * @author Michael Inden
 *         <p>
 *         Copyright 2021/22 by Michael Inden
 */
public class Exercise06_CompactNumberFormat 
{
    public static void main(final String args[]) 
    {
    	var allValues = List.of(1_000, 1_000_000, 1_000_000_000);
    	
    	var shortStyle = Style.SHORT;
        var shortDeFormat = NumberFormat.getCompactNumberInstance(Locale.GERMANY, 
    	                                                          shortStyle);
    	formatNumbers(shortStyle, shortDeFormat, allValues);
    
    	var longStyle = Style.LONG;
        var longItFormat = NumberFormat.getCompactNumberInstance(Locale.ITALY, 
                                                                 longStyle);
    	formatNumbers(longStyle, longItFormat, allValues);
    	
    	// Parsing, Achtung hier muss man beim shortStyle ein non-breakable Space (\u00a0) 
    	// statt des normalen (\u0020) einsetzen, longStyle nutzt normales Space
        parseNumbers(shortStyle, shortDeFormat, 
                     List.of("13 KILO", "1 Mio.", "1 Mrd."));
    	parseNumbers(longStyle, longItFormat, 
    	             List.of("mille", "1 milione"));
    }
    
    private static void formatNumbers(final Style style,
    		                          final NumberFormat format,
    		                          final List<Integer> values) 
    {
    	System.out.println("\nStyle " + style);
    			
    	values.forEach(value -> {
    		System.out.println("format('" + value + "') = " + format.format(value));
    	});
    }
    
    private static void parseNumbers(final Style style,
                                     final NumberFormat format,
                                     final List<String> textValues) 
    {
    	System.out.println("\nStyle " + style);
        	
    	textValues.forEach(value -> {
    		try {
    			System.out.println("parse('" + value + "') = " + format.parse(value));
    		} catch (ParseException e) {
    			e.printStackTrace();
    		}
    	});
    }
}
