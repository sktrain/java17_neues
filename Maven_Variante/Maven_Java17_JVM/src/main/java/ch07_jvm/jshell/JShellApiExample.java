package ch07_jvm.jshell;

import jdk.jshell.JShell;
import jdk.jshell.SnippetEvent;

import java.util.List;

/**
 * Beispielprogramm für die Workshops "Best of Java 11 - 17 / 18 / 19" und das
 * Buch "Java – Die Neuerungen in Version 17 LTS, 18 und 19"
 *
 * @author Michael Inden
 *         <p>
 *         Copyright 2021/22 by Michael Inden
 */
public class JShellApiExample
{
    public static void main(String[] args)
    {
        try (final JShell jshell = JShell.create())
        {
            final List<SnippetEvent> result1 = jshell.eval("var name = \"Mike\";");
    
            for (final SnippetEvent se : result1)
            {
                System.out.println(se.snippet());
                System.out.println(se.value());
                
                // leider kein (direkter) Zugriff auf Wert, nur über varValue()
                jshell.variables().map(varSnippet -> "variable: '" + varSnippet.name() + "' / " +
                                                     "type: " + varSnippet.typeName() + "' / " +
                                                     "value: " + jshell.varValue(varSnippet))
                          .forEach(System.out::println);
            }
        }
    }
}
