package edu.chnu.patterns.visitor;

public class StartNotificationVisitor implements Visitor {
	@Override
	public void visit(LabClass el) {
		System.out.println("Lab class started");
	}

	@Override
	public void visit(LectureClass el) {
		System.out.println("Lecture class started");
	}
}
