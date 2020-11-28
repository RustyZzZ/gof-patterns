package edu.chnu.patterns.observer;

public class Lecturer {
	private NotificationChannel publisher;
	public Lecturer(NotificationChannel publisher) {
		this.publisher = publisher;
	}

	public void sentUpdate(String updateMessage) {
		publisher.notifyAll(updateMessage);
	}
}
