package edu.chnu.patterns.observer;



public class Main {
	public static void main(String[] args) {
		var publisher = new NotificationChannel();
		publisher.subscribe(new AssistantSubscriber("Dracula"));
		publisher.subscribe(new AssistantSubscriber("Hulk"));
		publisher.subscribe(new StudentSubscriber("Diachuk",643));
		publisher.subscribe(new StudentSubscriber("Ivanov",643));
		publisher.subscribe(new StudentSubscriber("Petrov",643));
		var lecturer = new Lecturer(publisher);
		lecturer.sentUpdate("100(A) to everyone");
	}
}
