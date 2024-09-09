package ch04_syntax_ex_sol.exercises;

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
        switchOld(7);
        switchOld(10);

        System.out.println("Bonus A: " + switchBonusOld('A'));
        System.out.println("Bonus C: " + switchBonusOld('C'));
        System.out.println("Bonus E: " + switchBonusOld('E'));
    }

    private static void switchOld(final int number)
    {
        switch (number)
        {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Durchgefallen");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Gut");
                break;
            case 9:
            case 10:
                System.out.println("Exzellent");
                break;
            default:
                System.out.println("Ungültig");
                break;
        }
    }

    private static int switchBonusOld(final char grade)
    {
        int bonus;
        switch (grade)
        {
            case 'A':
                bonus = 2000;
                break;
            case 'B':
                bonus = 1000;
                break;
            case 'C':
                bonus = 500;
                break;
            default:
                bonus = 0;
                break;
        }

        return bonus;
    }
}
