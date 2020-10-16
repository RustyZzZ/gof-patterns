package edu.chnu.patterns.bridge;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class UniversityClass {

	protected WebMeetingService meetingService;
	protected String subject;
	public abstract void startClass();

}
