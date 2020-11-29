package edu.chnu.patterns.visitor;

public class Main {
	public static void main(String[] args) {
		var labClass = new LabClass();
		var lectureClass = new LectureClass();
		var startV = new StartNotificationVisitor();
		var endV = new EndNotificationVisitor();
		labClass.accept(startV);
		lectureClass.accept(startV);
		lectureClass.accept(endV);
		labClass.accept(endV);
	}
}
