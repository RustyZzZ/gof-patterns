package edu.chnu.patterns.adapter;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		var studentRepository = new StudentRepository();
		var studentService = new StudentService(studentRepository);
		studentService.getAll();

		var legacyStudentService = new StudentService(new LegacyDbToNewAdapter(new LegacyStudentRepository()));
		legacyStudentService.getAll();
		legacyStudentService.save(new Student("1", "Diachuk", 643));
		var all = legacyStudentService.getAll();
		System.out.println("all = " + all);
	}
}
