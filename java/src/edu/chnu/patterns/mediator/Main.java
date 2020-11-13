package edu.chnu.patterns.mediator;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		var assistant = new Assistant();
		var lecturer = new Lecturer();
		var students = Arrays.asList("Diachuk", "Ivanov", "Noris");

		var med = new SubjectMediator(lecturer, assistant, students);
		assistant.setMediator(med);
		lecturer.setMediator(med);

		assistant.sendMessage("^", "12123dasdas");
		assistant.sendMessage("Diachuk", "12123dasdas");
		lecturer.sendMessage( "sadasdasdad");
	}

}
