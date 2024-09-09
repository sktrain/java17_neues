package aufgabe7.reactive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Flow.Publisher;
import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.SubmissionPublisher;

public class WordPublisher implements Publisher<String> {
	private final SubmissionPublisher<String> publisher;

	public WordPublisher() {
		this.publisher = new SubmissionPublisher<>();
	}

	public void subscribe(final Subscriber<? super String> subscriber) {
		publisher.subscribe(subscriber);
	}

	public void doWork() throws IOException {
		Charset utf8 = StandardCharsets.UTF_8;
		try (InputStream is = Objects.requireNonNull(WordPublisher.class.getResourceAsStream("/input.txt"),
				"Datei gibt es nicht!")) {
			BufferedReader br = new BufferedReader(new InputStreamReader(is, utf8));
			List<String> ls = br.lines().toList();
			ls.forEach(line -> publisher.submit(line));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
