package aufgabe7.reactive;

import java.time.LocalDateTime;
import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

class SkipAndTakeSubscriber implements Subscriber<String> {

	private int skip;
	private int take;
	private Subscription subscription;
	private int counter = 1;

	public SkipAndTakeSubscriber(int skip, int take) {
		super();
		this.skip = skip;
		this.take = take;
	}

	public void onSubscribe(final Subscription subscription) {
		this.subscription = subscription;
		String header = "SkipAndTakeSubscriber - Subscription: " + subscription;
		System.out.println(header);
		subscription.request(skip + take);
	}

	public void onNext(final String item) {
		if (counter <= skip) {
			System.out.println(counter + " onNext()");
		} else {
			System.out.println(counter + " onNext(): " + item);
		}
		if (skip + take == counter++) {
			subscription.cancel();}

	}

	public void onComplete() {
		System.out.println(LocalDateTime.now() + " onComplete()");
	}

	public void onError(final Throwable throwable) {
		throwable.printStackTrace();
	}
}