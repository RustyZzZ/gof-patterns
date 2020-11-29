package edu.chnu.patterns.visitor;

public class LectureClass extends UniversityClass {

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
}

