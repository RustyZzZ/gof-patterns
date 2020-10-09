package edu.chnu.patterns.builder;

import java.util.List;

public class HangoutsMeetingBuilder implements WebMeetingBuilder {

	private static int count = 0;
	private String id;
	private ServiceType type;
	private int durationM;
	private String title;
	private List<String> participants;
	private String attachments;
	private boolean saveRecording;

	public HangoutsMeetingBuilder() {
	}

	@Override
	public WebMeetingBuilder setType() {
		this.type = ServiceType.HANGOUTS;
		return this;
	}

	@Override
	public WebMeetingBuilder setId() {
		this.id = "H" + count;
		return this;
	}

	@Override
	public WebMeetingBuilder setParticipants(List<String> participants) {
		this.participants = participants;
		return this;
	}

	@Override
	public WebMeetingBuilder setAttachments(String attachments) {
		this.attachments = attachments;
		return this;
	}

	@Override
	public WebMeetingBuilder setTitle(String title) {
		this.title = title;
		return this;
	}

	@Override
	public WebMeetingBuilder setDurationM(int durationM) {
		this.durationM = durationM;
		return this;
	}

	@Override
	public WebMeetingBuilder setSaveRecording() {
		this.saveRecording = true;
		return this;
	}

	@Override
	public WebMeeting build() {
		return new WebMeeting(this.id, this.type, this.durationM, this.title,
							  this.participants, this.attachments, this.saveRecording);
	}
}
