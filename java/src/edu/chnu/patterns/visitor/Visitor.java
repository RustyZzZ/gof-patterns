package edu.chnu.patterns.visitor;

public interface Visitor {
	void visit(LabClass el);
	void visit(LectureClass el);
}
