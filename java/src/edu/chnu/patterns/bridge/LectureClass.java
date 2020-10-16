package edu.chnu.patterns.bridge;

import lombok.AllArgsConstructor;

public class LectureClass extends UniversityClass {


	public LectureClass(WebMeetingService meetingService, String subject) {
		super(meetingService, subject);
	}

	@Override
	public void startClass() {
		System.out.println("Start lecture of '" + super.subject + "'");
		meetingService.startMeeting();
	}

	public void endClass(){
		System.out.println("End lecture");
		meetingService.endMeeting();
	}
}
