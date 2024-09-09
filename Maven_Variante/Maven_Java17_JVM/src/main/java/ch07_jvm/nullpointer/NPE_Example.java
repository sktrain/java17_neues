package ch07_jvm.nullpointer;

/**
 * Beispielprogramm für die Workshops "Best of Java 11 - 17 / 18 / 19" und das
 * Buch "Java – Die Neuerungen in Version 17 LTS, 18 und 19"
 *
 * @author Michael Inden
 *         <p>
 *         Copyright 2021/22 by Michael Inden
 */
public class NPE_Example
{
    class A
    {
        String value;
    }
    
    public static void main(final String[] args)
    {
        A a = null;
        a.value = "ERROR";
    }
}