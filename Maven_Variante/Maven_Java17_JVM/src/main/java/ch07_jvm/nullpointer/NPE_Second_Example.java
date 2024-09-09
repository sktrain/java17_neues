package ch07_jvm.nullpointer;

/**
 * Beispielprogramm für die Workshops "Best of Java 11 - 17 / 18 / 19" und das
 * Buch "Java – Die Neuerungen in Version 17 LTS, 18 und 19"
 *
 * @author Michael Inden
 *         <p>
 *         Copyright 2021/22 by Michael Inden
 */
public class NPE_Second_Example
{
    public static void main(final String[] args)
    {
        try
        {
            final String[] stringArray = { null, null, null };
            final int errorPos = stringArray[2].lastIndexOf("ERROR");
        }
        // In der Praxis bitte keine NullPointerException fangen,
        // hier nur damit die folgenden Anweisungen ausgeführt werden
        catch (final NullPointerException e)
        {
            e.printStackTrace();
        }

        try
        {
            final Integer value = null;
            final int sum = value + 3;
        }
        catch (final NullPointerException e)
        {
            e.printStackTrace();
        }
    }
}