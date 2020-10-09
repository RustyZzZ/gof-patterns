package edu.chnu.patterns.builder;

import java.util.List;

public interface WebMeetingBuilder {
	WebMeetingBuilder setType();
	WebMeetingBuilder setId();
	WebMeetingBuilder setParticipants(List<String> participants);
	WebMeetingBuilder setAttachments(String attachments);
	WebMeetingBuilder setTitle(String title);
	WebMeetingBuilder setDurationM(int durationM);
	WebMeetingBuilder setSaveRecording();
	WebMeeting build();
}
