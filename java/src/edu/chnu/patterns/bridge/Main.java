package edu.chnu.patterns.bridge;

public class Main {
	public static void main(String[] args) {
		var paterns = new LectureClass(new GoogleWebMeeting(), "Paterns");
		var paterns1 = new LectureClass(new ZoomWebMeeting(), "Paterns");

		paterns1.startClass();
		paterns1.endClass();
	}
}
