package ch04_syntax_ex_sol.solutions;

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
        int value = 6;
    
        dumbEvenOddChecker2a(value);
    
        String result1 = dumbEvenOddChecker2b(value);
        System.out.println("result1: " + result1);
    
        String result2 = dumbEvenOddChecker2cSpecialCase(value);
        System.out.println("result2: " + result2);
    
        String result3 = dumbEvenOddChecker2dWithYield(value);
        System.out.println("result3: " + result3);
    }

    private static void dumbEvenOddChecker2a(int value)
    {
        String result;  

        switch (value)
        {
            case 1, 3, 5, 7, 9 -> result = "odd";
            case 0, 2, 4, 6, 8, 10 -> result = "even";
            default -> result = "only implemented for values from 0 to 9";
        }

        System.out.println("result: " + result);
    }

    private static String dumbEvenOddChecker2b(int value)
    {
        return switch (value)
        {
            case 1, 3, 5, 7, 9 -> "odd";
            case 0, 2, 4, 6, 8, 10 -> "even";
            default -> "only implemented for values from 0 to 9";
        };
    }

    private static String dumbEvenOddChecker2cSpecialCase(int value)
    {
        return switch (value)
        {
            case 1, 3, 5, 7, 9 -> "odd";
            case 0, 2, 4, 6, 8, 10 ->
            {
                if (value > 1 && value < 9)
                    System.out.println("Hurra, es ist gerade und im Bereich 2 -- 8");
    
                yield "even";
            }
            default -> "only implemented for values from 0 to 9";
        };
    }

    private static String dumbEvenOddChecker2dWithYield(int value)
    {
        return switch (value)
        {
            case 1, 3, 5, 7, 9:
                yield "odd";
            case 0, 2, 4, 6, 8, 10:
                yield "even";
            default:
                yield "only implemented for values from 0 to 9";
        };
    }
}
