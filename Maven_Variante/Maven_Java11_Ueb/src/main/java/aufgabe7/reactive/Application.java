package aufgabe7.reactive;

import java.io.IOException;

public class Application {
	
	public static void main(final String[] args) throws IOException,
	InterruptedException
	{
	final WordPublisher publisher = new WordPublisher();
	publisher.subscribe(new WordSubscriber());
	publisher.doWork();
	Thread.sleep(10_000); // auf das Ende der Verarbeitung warten
	}

}
