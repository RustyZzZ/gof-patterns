package edu.chnu.patterns.objectPool;

public class Main {
	public static void main(String[] args) {
		var pool = new WebMeetingPool();
		var meeting = pool.getMeeting();
		meeting.setTitle("Mathematica ");
		meeting.startMeeting();
		pool.getMeeting().startMeeting();
		pool.releaseMeeting(meeting);
		pool.getMeeting().startMeeting();
	}

	public static void main1(String[] args) {
		WebMeeting.builder().id("1").title("Patterns").type(ServiceType.ZOOM).build().startMeeting();
		WebMeeting.builder().id("2").title("Patterns").type(ServiceType.ZOOM).build().startMeeting();
		WebMeeting.builder().id("3").title("Patterns").type(ServiceType.HANGOUTS).build().startMeeting();
		WebMeeting.builder().id("4").title("Patterns").type(ServiceType.HANGOUTS).build().startMeeting();
	}
}
