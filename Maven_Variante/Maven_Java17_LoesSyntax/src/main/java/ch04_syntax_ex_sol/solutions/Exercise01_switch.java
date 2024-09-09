package ch04_syntax_ex_sol.solutions;

/**
 * Beispielprogramm für die Workshops "Best of Java 11 - 17 / 18 / 19" und das
 * Buch "Java – Die Neuerungen in Version 17 LTS, 18 und 19"
 *
 * @author Michael Inden
 *         <p>
 *         Copyright 2021/22 by Michael Inden
 */
public class Exercise01_switch
{
    public static void main(String[] args)
    {
        switchNew(7);
        switchNew(10);

        System.out.println("Bonus A: " + switchBonusNew('A'));
        System.out.println("Bonus C: " + switchBonusNew('C'));
        System.out.println("Bonus E: " + switchBonusNew('E'));
    }

    private static void switchNew(final int number)
    {
        switch (number)
        {
            case 0, 1, 2, 3, 4, 5 -> System.out.println("Durchgefallen");
            case 6, 7, 8 -> System.out.println("Gut");
            case 9, 10 -> System.out.println("Exzellent");
            default -> System.out.println("Ungültig");
        }
    }

    private static int switchBonusNew(final char grade)
    {
        return switch (grade)
        {
            case 'A' -> 2000;
            case 'B' -> 1000;
            case 'C' -> 500;
            default -> 0;
        };
    }
}
