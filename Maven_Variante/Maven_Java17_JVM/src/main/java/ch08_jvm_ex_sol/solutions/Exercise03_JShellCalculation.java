package ch08_jvm_ex_sol.solutions;

import jdk.jshell.JShell;
import jdk.jshell.SnippetEvent;
import jdk.jshell.VarSnippet;

import java.util.List;
import java.util.function.Consumer;

/**
 * Beispielprogramm für die Workshops "Best of Java 11 - 17 / 18 / 19" und das
 * Buch "Java – Die Neuerungen in Version 17 LTS, 18 und 19"
 *
 * @author Michael Inden
 *         <p>
 *         Copyright 2021/22 by Michael Inden
 */
public class Exercise03_JShellCalculation 
{
	public static void main(final String args[]) 
	{
		try (JShell jshell = JShell.create()) 
		{
			jshell.eval("int x = 7;");
			jshell.eval("int y = 6;");
			List<SnippetEvent> snippetEvents = 
					           jshell.eval("int result = x * y;");
			System.out.println("Size of list: " + snippetEvents.size());
			System.out.println("Value of the expression is " + 
			                   snippetEvents.get(0).value());

			jshell.eval("import java.time.*;");
			jshell.eval("var today = LocalDate.now();");

			jshell.eval("import java.util.*;");
			jshell.eval("var values = List.of(1, 2, 3, 4);");

			jshell.variables().forEach(printVarInfo(jshell));
			snippetEvents = jshell.eval("""
					for (var val : values) {
					     System.out.println("val: " + val);
					}
					""");
			System.out.println("source: " + snippetEvents.get(0).
					                        snippet().source());
		}
	}

	private static Consumer<VarSnippet> printVarInfo(JShell jshell) 
	{
		return x -> System.out.println("var:" + x.name() + 
				                       "=" + jshell.varValue(x));
	}
}