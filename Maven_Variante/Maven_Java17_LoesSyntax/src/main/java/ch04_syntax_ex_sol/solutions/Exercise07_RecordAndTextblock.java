package ch04_syntax_ex_sol.solutions;

import java.time.LocalDate;

/**
 * Beispielprogramm für die Workshops "Best of Java 11 - 17 / 18 / 19" und das
 * Buch "Java – Die Neuerungen in Version 17 LTS, 18 und 19"
 *
 * @author Michael Inden
 *         <p>
 *         Copyright 2021/22 by Michael Inden
 */
public class Exercise07_RecordAndTextblock
{
    record Person(String firstName, String lastName, LocalDate birthday)
    {
        public Person
        {
            if (firstName.length() < 3 || lastName.length() < 3)
            {
                String errorMsg = "first / last name must be at least 3 chars long";
                throw new IllegalArgumentException(errorMsg);
            }

            if (birthday.isAfter(LocalDate.now()))
            {
                String errorMsg = "birthday can not be in the future";
                throw new IllegalArgumentException(errorMsg);
            }
        }

        String toXml()
        {
            return """
                            <Person>
                            	<firstName>%s</firstName>
                            	<lastName>%s</lastName>
                            	<birthday>%s</birthday>
                            </Person>
                            """.formatted(firstName, lastName, birthday);
            /* Achtung nicht: """.format(firstName, lastName, birthday);*/
        }

        String toJSON()
        {
            return """
                            (
                             	"firstName" : "%s",
                            	"lastName" : "%s",
                            	"birthday" : "%s"
                            )
                            """.formatted(firstName, lastName, birthday);
        }
    }

    public static void main(final String[] args)
    {
        Person mike = new Person("Michael", "Inden", LocalDate.of(1971, 2, 7));
    
        System.out.println(mike);
        System.out.println(mike.toXml());
        System.out.println(mike.toJSON());
    
        checkNameTooShort();
    
        checkBirthdayErrorHandling();
    }

    private static void checkNameTooShort()
    {
        try
        {
            Person toShort = new Person("Mi", "In", LocalDate.of(1971, 2, 7));
    
            System.out.println(toShort);
            System.out.println(toShort.toXml());
            System.out.println(toShort.toJSON());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void checkBirthdayErrorHandling()
    {
        try
        {
            Person captainFuture = new Person("Captain", "Future", LocalDate.of(2071, 2, 7));

            System.out.println(captainFuture);
            System.out.println(captainFuture.toXml());
            System.out.println(captainFuture.toJSON());
        }
        catch (Exception e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
