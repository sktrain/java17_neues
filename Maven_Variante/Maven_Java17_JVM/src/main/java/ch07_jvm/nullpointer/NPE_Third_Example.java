package ch07_jvm.nullpointer;

/**
 * Beispielprogramm für die Workshops "Best of Java 11 - 17 / 18 / 19" und das
 * Buch "Java – Die Neuerungen in Version 17 LTS, 18 und 19"
 *
 * @author Michael Inden
 *         <p>
 *         Copyright 2021/22 by Michael Inden
 */
public class NPE_Third_Example
{
    public static void main(final String[] args) 
    {
        int width = getWindowManager().getWindow(5).size().width();
        System.out.println("Width: "  + width);
    }
    
    public static WindowManager getWindowManager() 
    {       
        return new WindowManager();
    }
    
    public static class WindowManager
    {
        public Window getWindow(final int i) 
        {
            return null;
        }   
    }
    
    public static record Window(Size size) {}
    public static record Size(int width, int height) {}
}