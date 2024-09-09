package ch04_syntax_ex_sol.exercises;

/**
 * Beispielprogramm für die Workshops "Best of Java 11 - 17 / 18 / 19" und das
 * Buch "Java – Die Neuerungen in Version 17 LTS, 18 und 19"
 *
 * @author Michael Inden
 *         <p>
 *         Copyright 2021/22 by Michael Inden
 */
public class Exercise02_switch
{
    public static void main(String[] args)
    {
        int value = 7;

        dumbEvenOddChecker(value);
    }

    private static void dumbEvenOddChecker(int value)
    {
        String result;
    
        switch (value)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
                result = "odd";
                break;
    
            case 0:
            case 2:
            case 4:
            case 6:
            case 8:
                result = "even";
                break;
    
            default:
                result = "only implemented for values from 0 to 9";
        }
    
        System.out.println("result: " + result);
    }
}
