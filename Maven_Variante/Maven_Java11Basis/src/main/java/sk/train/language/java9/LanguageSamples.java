package sk.train.language.java9;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Comparator;

public class LanguageSamples {

	public static void main(String[] args) {

		// Anonyme innere Klassen und der Diamond-Operator
		Comparator<String> comps = new Comparator<>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		};

		// Effective final Ressourcen bei try-with-resources
		final InputStream is = System.in;
		PrintStream os = System.out; // effective final
		try (is; os) {
				os.println(is.read());
				// ...
			
		} catch (IOException e) { e.printStackTrace(); }
	}
}

// private Methoden in Interfaces
interface myif {
	public abstract void f();
	
	public default int fdefault() {return 0;} //Java 8
	public static int fstatic() {return 1;}   //Java 8
	
	private static int pstatic() {return fstatic();}  //Java 9
	private int pinstance( ) {return fdefault();}	//Java 9
	
	
}
