package sk.train.kleingkeiten;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class TestSonstiges {

	public static void main(final String[] args)
    {
		//Deprecated
        someOldMethod();
        
        //<> for anonymous inner classes
        Comparator<String> c = new Comparator<>() {

			@Override
			public int compare(String o1, String o2) {
				return (o1.length()-o2.length());
			}        	
        };
        
        //effective final resources in ARM
        final BufferedInputStream bis = new BufferedInputStream(System.in);
        BufferedOutputStream bos = new BufferedOutputStream(System.out);  //effective final
        try (bis; bos){
        	//...
        }
        catch(IOException e) {
        	//...
        }
    }

    /**
     * @deprecated this method is replaced by someNewMethod() which is more stable
     */
    @Deprecated(since = "11", forRemoval = true)
    private static void someOldMethod()
    {
        // ...
    }
    
    @SafeVarargs
	public static void alpha(List<String>... args) {
	}

	// @SafeVarargs // not allowed
	public void beta(List<String>... args) { // compiler-warning

	}

	@SafeVarargs
	public final void gamma(List<String>... args) {

	}

	@SafeVarargs  //ab Java 9
	private void delta(List<String>... args) {

	}

}
