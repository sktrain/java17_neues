package ch05_api.dynamicproxys;

/**
 * Beispielprogramm für die Workshops "Best of Java 11 - 17 / 18 / 19" und das
 * Buch "Java – Die Neuerungen in Version 17 LTS, 18 und 19"
 *
 * @author Michael Inden
 *         <p>
 *         Copyright 2021/22 by Michael Inden
 */
class ExampleClass implements ExampleIf
{
    @Override
    public String greeting()
    {
        return "hello" + msgDefault();
    }

    @Override
    public String msgDefault()
    {
        return "overwritten";
    }
}