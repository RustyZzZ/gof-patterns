package edu.chnu.patterns.observer;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class NotificationChannel {
	private List<Subscriber> subscribers = new ArrayList<>();

	public void subscribe(Subscriber sub) {
		subscribers.add(sub);
	}

	public void unsubscribe(Subscriber subscriber) {
		subscribers.remove(subscriber);
	}

	public void notifyAll(String msg) {
		subscribers.forEach(el -> el.processUpdate(msg));
	}

}
