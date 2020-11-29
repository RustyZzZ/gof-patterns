package edu.chnu.patterns.visitor;

public class LabClass extends UniversityClass {
	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
}
