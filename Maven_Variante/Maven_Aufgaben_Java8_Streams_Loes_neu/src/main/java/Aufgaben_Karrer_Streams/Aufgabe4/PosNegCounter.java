package Aufgaben_Karrer_Streams.Aufgabe4;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PosNegCounter {

	public static void main(String[] args) {

         Stream<Integer> is = Stream.of(-1, 3, 5, 0, -4, 7, 0, 8);
         
         Map<String, Long> result = is.collect(Collectors.groupingBy(value -> { 
        	                                         if (value < 0 ) return "neg";
         											 if (value > 0) return "pos";
         											 else return "null";        	 
                                                    }, Collectors.counting()));
         
         System.out.println(result);

	}

}
