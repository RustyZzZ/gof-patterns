package edu.chnu.patterns.visitor;

public class EndNotificationVisitor implements Visitor{
	@Override
	public void visit(LabClass el) {
		System.out.println("Lab class finished");
	}

	@Override
	public void visit(LectureClass el) {
		System.out.println("Lecture class finished");
	}
}
