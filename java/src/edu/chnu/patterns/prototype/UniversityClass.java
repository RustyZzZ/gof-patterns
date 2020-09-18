package edu.chnu.patterns.prototype;

import java.time.LocalDateTime;

public abstract class UniversityClass implements Cloneable {
	private String subject;
	private String lecturer;
	private LocalDateTime time;


	protected abstract UniversityClass copy();
	public abstract void notifyAttendee();

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getLecturer() {
		return lecturer;
	}

	public void setLecturer(String lecturer) {
		this.lecturer = lecturer;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	protected UniversityClass(UniversityClass uc){
		this.lecturer = uc.lecturer;
		this.subject = uc.subject;
		this.time = uc.time;
	}

	public UniversityClass(String subject, String lecturer, LocalDateTime time) {
		this.subject = subject;
		this.lecturer = lecturer;
		this.time = time;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
