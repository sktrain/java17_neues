package ch07_jvm.deprecations;

import jdk.jshell.JShell;
import jdk.jshell.SnippetEvent;
import jdk.jshell.VarSnippet;

import java.util.function.Consumer;

/**
 * Beispielprogramm für die Workshops "Best of Java 11 - 17 / 18 / 19" und das
 * Buch "Java – Die Neuerungen in Version 17 LTS, 18 und 19"
 *
 * @author Michael Inden
 *         <p>
 *         Copyright 2021/22 by Michael Inden
 */
public class JShellApiDynamicCalculationExample
{
    public static void main(final String[] args)
    {
        try (var jshell = JShell.create())
        {
            var snippetEvents = jshell.eval("7 + 2 * 71");
            snippetEvents.forEach(printSnippet());

            int yearsOld = 51;
            snippetEvents = jshell.eval("var msg = String.format(\"%d years" + 
                                        " old!\", " + yearsOld + ");");
            snippetEvents.forEach(printSnippet());

            int x = 51;
            snippetEvents = jshell.eval("Math.sin(" + x + ") + Math.cos(" + x + ")");
            snippetEvents.forEach(printSnippet());

            jshell.eval("import static java.lang.Math.*;");
            snippetEvents = jshell.eval("sin(" + x + ") + cos(" + x + ")");
            snippetEvents.forEach(printSnippet());

            System.out.println("\nAll variables:");
            jshell.variables().forEach(printVariable(jshell));
        }
    }

	private static Consumer<SnippetEvent> printSnippet() {
		return snippetEvent -> System.out.println(snippetEvent.value());
	}
	
	private static Consumer<VarSnippet> printVariable(JShell jshell) {
		return var -> System.out.println(var.name() + 
				                         " = " + jshell.varValue(var));
	}
}