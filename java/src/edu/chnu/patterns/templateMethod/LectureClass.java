package edu.chnu.patterns.templateMethod;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class LectureClass extends UniversityClass {
	public LectureClass(String subj) {
		super(subj);
	}

	@Override
	protected void notifyClassStarted() {
		System.out.println("Lecture Class Started " + subj);
	}

	@Override
	protected void setMarks() {
		System.out.println("No marks set");
	}

	@Override
	protected void finishClass() {
		System.out.println("Lectire class finished");
	}
}
