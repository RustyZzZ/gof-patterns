package edu.chnu.patterns.bridge;

import java.util.Random;

public class ZoomWebMeeting implements WebMeetingService {
	@Override
	public void startMeeting() {
		System.out.println("Zoom meeting room started with id = " + getMeetingRoomId());
	}

	@Override
	public void endMeeting() {
		System.out.println("End zoom meeting");
	}

	private Integer getMeetingRoomId() {
		var random = new Random();
		return random.nextInt(100000) * 10 + random.nextInt(1000);
	}

}
