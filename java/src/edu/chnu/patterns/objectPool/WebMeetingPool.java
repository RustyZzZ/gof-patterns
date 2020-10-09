package edu.chnu.patterns.objectPool;

import java.util.Arrays;
import java.util.List;

public class WebMeetingPool {
	private List<WebMeeting> pool = Arrays.asList(
			WebMeeting.builder().id("2").title("Patterns").type(ServiceType.ZOOM).status(Status.READY).build(),
			WebMeeting.builder().id("3").title("Patterns").type(ServiceType.HANGOUTS).status(Status.READY).build()
	);


	public WebMeeting getMeeting() {
		if (hasFree()) {
			var webMeeting = pool.stream().filter(el -> el.getStatus() == Status.READY).findFirst().get();
			webMeeting.setStatus(Status.RUNNING);
			return webMeeting;

		} else {
			System.out.println("No free web meetings now");
			return null;
		}
	}

	public void releaseMeeting(WebMeeting webMeeting) {
		webMeeting.setStatus(Status.READY);
		webMeeting.setTitle("");
	}

	private boolean hasFree() {
		return pool.stream().anyMatch(el -> el.getStatus() == Status.READY);
	}
}
