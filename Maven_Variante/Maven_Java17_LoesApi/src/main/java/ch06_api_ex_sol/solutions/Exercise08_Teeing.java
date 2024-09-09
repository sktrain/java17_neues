package ch06_api_ex_sol.solutions;

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

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
        Stream<City> cities = Stream.of(new City("Zurich", "Europe"), 
                                        new City("Bremen", "Europe"),
                                        new City("Kiel", "Europe"), 
                                        new City("San Francisco", "America"),
                                        new City("Lima", "America"), 
                                        new City("Aachen", "Europe"),
                                        new City("Hong Kong", "Asia"), 
                                        new City("Tokyo", "Asia"));
    
        Predicate<City> isInEurope = city -> city.locatedIn("Europe");
        Predicate<City> isInAsia = city -> city.locatedIn("Asia");
    
        var result = cities.collect(teeing(filtering(isInEurope, 
                                                     mapping(City::name, 
                                                             Collectors.toList())),
                                           filtering(isInAsia, counting()),
                                           (europeanCities, asianCityCount) -> 
                                           "cities in europe=%s\n#asian cities=%d"
                                           .formatted(europeanCities, 
                                                      asianCityCount)));
    
        System.out.println(result);
    }

    static record City(String name, String region)
    {
        public boolean locatedIn(String region)
        {
            return this.region.equalsIgnoreCase(region);
        }
    }
}
