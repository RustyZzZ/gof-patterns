package edu.chnu.patterns.templateMethod;

public class PracticalClass extends UniversityClass {


	public PracticalClass(String subj) {
		super(subj);
	}

	@Override
	protected void notifyClassStarted() {
		System.out.println("Practical Class Started " + subj);
	}

	@Override
	protected void setMarks() {
		var marks = "[Diachuk: 10, Ivanov: 10, Petrov: 5, ...]";
		System.out.println("Set Marks " + marks);
	}

	@Override
	protected void finishClass() {
		System.out.println("Practical class finished");
	}
}
