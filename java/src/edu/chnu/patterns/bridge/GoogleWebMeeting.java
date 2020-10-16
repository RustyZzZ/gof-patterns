package edu.chnu.patterns.bridge;

import java.util.Random;

public class GoogleWebMeeting implements WebMeetingService {
	private int id;

	@Override
	public void startMeeting() {
		var random = new Random();
		this.id = random.nextInt(1000);
		System.out.println("Google meeting room started with id = " + this.id);
	}

	public void endMeeting() {
		System.out.println(this.id + "ended");
	}
}
