package ch04_syntax_ex_sol.solutions;

/**
 * Beispielprogramm für die Workshops "Best of Java 11 - 17 / 18 / 19" und das
 * Buch "Java – Die Neuerungen in Version 17 LTS, 18 und 19"
 *
 * @author Michael Inden
 *         <p>
 *         Copyright 2021/22 by Michael Inden
 */
public class Exercise03_switch
{
    public static void main(String[] args)
    {
        detectKeyJava17('2');
        detectKeyJava17('7');
      
        detectKeyJava17Improved('2');
        detectKeyJava17Improved('7');
    }

    static void detectKeyJava17(final char key) 
    {
        switch (key) 
        {
            case '0' -> System.out.println("You pressed: 0");
            case '1' -> System.out.println("You pressed: 1");
            case '2' -> System.out.println("You pressed: 2");
            case '3' -> System.out.println("You pressed: 3");
            case '4' -> System.out.println("You pressed: 4");
            case '5', '6', '7', '8', '9' -> 
                System.out.println("You pressed: " + key);
            default -> System.out.println("Not allowed!");
        }
    }
    
    // improved
    
    static void detectKeyJava17Improved(final char key) 
    {
        switch (key) 
        {
            case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> 
                System.out.println("You pressed: " + key);
            default -> System.out.println("Not allowed!");
        }
    }
}
