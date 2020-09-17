package edu.chnu.patterns.prototype;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class LectureClass extends UniversityClass{
	private List<Integer> attendeeGroups;

	@Override
	public LectureClass copy() {
		return new LectureClass(this);
	}

	@Override
	public void notifyAttendee() {
		attendeeGroups.forEach(this::notify);
		System.out.println("________________________________________");
	}

	private void notify(Integer group) {
		System.out.println(group + " group will have LECTURE " + this.getSubject() + " at " + this.getTime());
	}

	public LectureClass(LectureClass lectureClass){
		super(lectureClass);
		this.attendeeGroups = new ArrayList<>(lectureClass.attendeeGroups);
	}

	public List<Integer> getAttendeeGroups() {
		return attendeeGroups;
	}

	public void setAttendeeGroups(List<Integer> attendeeGroups) {
		this.attendeeGroups = attendeeGroups;
	}

	public LectureClass(String subject, String lecturer, LocalDateTime time, List<Integer> groups) {
		super(subject, lecturer, time);
		this.attendeeGroups = groups;
	}
}
