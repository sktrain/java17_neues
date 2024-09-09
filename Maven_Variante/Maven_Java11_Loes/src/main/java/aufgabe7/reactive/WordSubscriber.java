package aufgabe7.reactive;

import java.time.LocalDateTime;
import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

class WordSubscriber implements Subscriber<String> {
	public void onSubscribe(final Subscription subscription) {
		subscription.request(Long.MAX_VALUE);
	}

	public void onNext(final String item) {
		System.out.println(LocalDateTime.now() + " onNext(): " + item);
	}

	public void onComplete() {
		System.out.println(LocalDateTime.now() + " onComplete()");
	}

	public void onError(final Throwable throwable) {
		throwable.printStackTrace();
	}
}