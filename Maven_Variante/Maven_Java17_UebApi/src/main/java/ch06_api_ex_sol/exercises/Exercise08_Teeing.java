package ch06_api_ex_sol.exercises;

import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Beispielprogramm für die Workshops "Best of Java 11 - 17 / 18 / 19" und das
 * Buch "Java – Die Neuerungen in Version 17 LTS, 18 und 19"
 *
 * @author Michael Inden
 *         <p>
 *         Copyright 2021/22 by Michael Inden
 */
public class Exercise08_Teeing 
{
	public static void main(final String[] args) 
	{
		Stream<City> cities = Stream.of(
				new City("Zurich", "Europe"),
				new City("Bremen", "Europe"),
				new City("Kiel", "Europe"),
				new City("San Francisco", "America"),
				new City("Lima", "America"),
				new City("Aachen", "Europe"),
				new City("Hong Kong", "Asia"),
				new City("Tokyo", "Asia"));
		
		Predicate<City> isInEurope = city -> city.locatedIn("Europe");
		Predicate<City> isInAsia = city -> city.locatedIn("Asia");
		
		// TODO
		// var result = exampleCities.collect(teeing(
		
		// System.out.println(result);
	}
	
    static class City 
    {
    	private final String name;
    	private final String region;
    
    	public City(String name, String region) {
    
    		this.name = name;
    		this.region = region;
    	}
    
    	public String getName() {
    		return name;
    	}
    
    	public String getRegion() {
    		return region;
    	}
    	
    	public boolean locatedIn(String region) {
    		return this.region.equalsIgnoreCase(region);
    	}
    }
}
