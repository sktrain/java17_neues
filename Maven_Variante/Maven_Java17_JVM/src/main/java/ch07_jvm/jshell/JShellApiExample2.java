package ch07_jvm.jshell;

import jdk.jshell.JShell;

/**
 * Beispielprogramm für die Workshops "Best of Java 11 - 17 / 18 / 19" und das
 * Buch "Java – Die Neuerungen in Version 17 LTS, 18 und 19"
 *
 * @author Michael Inden
 *         <p>
 *         Copyright 2021/22 by Michael Inden
 */
public class JShellApiExample2
{
    public static void main(String[] args)
    {
        try (final JShell jshell = JShell.create())
        {
            // Achtung: Hier ist das Semikolon nötig, sonst inkorrekte Auswertung
            String valA = jshell.eval("int a = 42;").get(0).value();
            System.out.println("a = " + valA);
            String valB = jshell.eval("int b = 7;").get(0).value();
            System.out.println("b = " + valB);
            String result = jshell.eval("int result = a / b;").get(0).value();
            System.out.println("result = " + result);

            System.out.println("Variables");
            jshell.variables().map(varSnippet -> varSnippet.name() + " => " +
                                   varSnippet.source()).forEach(System.out::println);
        }
    }
}
