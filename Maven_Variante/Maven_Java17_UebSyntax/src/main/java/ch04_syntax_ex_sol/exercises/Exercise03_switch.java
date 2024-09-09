package ch04_syntax_ex_sol.exercises;

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
        detectKeyJava11('2');
        detectKeyJava11('7');
    }

    static void detectKeyJava11(final char key) 
    {
        switch (key) 
        {
            case '0':
                System.out.println("You pressed: 0");
                break;
            case '1':
                System.out.println("You pressed: 1");
                break;
            case '2':
                System.out.println("You pressed: 2");
            case '3':
                System.out.println("You pressed: 3");
            case '4':
                System.out.println("You pressed: 4");
                break;
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                System.out.println("You pressed: " + key);
                break;
            default:
                System.out.println("Not allowed!");
        }
    }
}
