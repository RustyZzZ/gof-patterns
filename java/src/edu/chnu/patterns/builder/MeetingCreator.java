package edu.chnu.patterns.builder;

import java.util.Arrays;

public class MeetingCreator {
	public static void main(String[] args) {
		var webMeeting = newHangoutsMeetingsCreation();
		webMeeting.startMeeting();
	}

	private static WebMeeting oldHangoutsMeetingsCreation() {
		var students = Arrays.asList("Ivanov", "Sidorov");
		return new WebMeeting("H1", ServiceType.HANGOUTS, 80,
							  "Patterns", students, "The best MEME", true);
	}

	private static WebMeeting newHangoutsMeetingsCreation() {
		var builder = new HangoutsMeetingBuilder();
		var students = Arrays.asList("Ivanov", "Sidorov");
		return builder.setId()
					  .setType()
					  .setDurationM(10)
					  .setSaveRecording()
					  .setTitle("Patterns")
					  .setParticipants(students)
					  .build();
	}
}
