package edu.chnu.patterns.prototype;

import java.time.LocalDateTime;

public class LabClass extends UniversityClass {
	private Integer attendeeGroup;


	public LabClass(LabClass labClass) {
		super(labClass);
		this.attendeeGroup = labClass.attendeeGroup;
	}

	public LabClass(String subject, String lecturer, LocalDateTime time, Integer attendeeGroup) {
		super(subject, lecturer, time);
		this.attendeeGroup = attendeeGroup;
	}

	public Integer getAttendeeGroup() {
		return attendeeGroup;
	}

	public void setAttendeeGroup(Integer attendeeGroup) {
		this.attendeeGroup = attendeeGroup;
	}

	@Override
	public LabClass copy() {
		return new LabClass(this);
	}

	@Override
	public void notifyAttendee() {
		System.out.println(this.attendeeGroup + " group will have LAB " + this.getSubject() + " at " + this.getTime());
		System.out.println("________________________________________");
	}

}
