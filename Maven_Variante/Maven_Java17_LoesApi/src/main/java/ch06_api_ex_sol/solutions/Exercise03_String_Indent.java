package ch06_api_ex_sol.solutions;

/**
 * Beispielprogramm für die Workshops "Best of Java 11 - 17 / 18 / 19" und das
 * Buch "Java – Die Neuerungen in Version 17 LTS, 18 und 19"
 *
 * @author Michael Inden
 *         <p>
 *         Copyright 2021/22 by Michael Inden
 */
public class Exercise03_String_Indent 
{
    public static void main(String[] args) 
    {
    	String originalString = "first_line\nsecond_line\nlast_line";
    
    	// 3a
    	System.out.println(originalString);
    	System.out.println("-- indented string --");
    
    	String indentedString = originalString.indent(7);
    	System.out.println(indentedString);
    
    	System.out.println("-- corrected indented string --");
    	String correctedIndentedString = indentedString.indent(-3);
    	System.out.println(correctedIndentedString);
    
    	// 3b
        String multiLineIndentedString = "LINE 1\n    LINE 2" + 
                                         "\n            LINE 3\n     LINE 4";
    	System.out.println(multiLineIndentedString);
                  
    	System.out.println("-- negatively indented string --");
    	String result = multiLineIndentedString.indent(-10);
    	System.out.println(result);      
    }
}
