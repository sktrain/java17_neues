package ch04_syntax_ex_sol.exercises;

/**
 * Beispielprogramm für die Workshops "Best of Java 11 - 17 / 18 / 19" und das
 * Buch "Java – Die Neuerungen in Version 17 LTS, 18 und 19"
 *
 * @author Michael Inden
 *         <p>
 *         Copyright 2021/22 by Michael Inden
 */
public class Exercise08_instanceof
{
    public static void main(String[] args)
    {
        Object obj = "BITTE MICHAEL";

        if (obj instanceof String)
        {
            final String str = (String) obj;
            if (str.contains("BITTE"))
            {
                System.out.println("It contains the magic word!");
            }
        }
    }
}
