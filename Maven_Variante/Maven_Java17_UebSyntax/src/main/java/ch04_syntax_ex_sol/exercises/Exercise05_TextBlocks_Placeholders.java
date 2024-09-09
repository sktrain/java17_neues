package ch04_syntax_ex_sol.exercises;

/**
 * Beispielprogramm für die Workshops "Best of Java 11 - 17 / 18 / 19" und das
 * Buch "Java – Die Neuerungen in Version 17 LTS, 18 und 19"
 *
 * @author Michael Inden
 *         <p>
 *         Copyright 2021/22 by Michael Inden
 */
public class Exercise05_TextBlocks_Placeholders 
{
	public static void main(final String[] args) 
	{
        String multiLineStringWithPlaceHoldersOld = String.format("HELLO \"%s\"!\n" +
                        "  HAVE %s\n" +
                        "  NICE \"%s\"!",
                        "WORLD", "A", "DAY");		
		System.out.println(multiLineStringWithPlaceHoldersOld);

		String multiLineStringWithPlaceHolders = null; // TODO
		System.out.println(multiLineStringWithPlaceHolders);		
	}
}
