package edu.chnu.patterns.facade;

import java.util.Map;

import edu.chnu.domain.Student;

public class NewDbService {
	private static Map<String, Student> students = Map.of("Shevchenko", new Student("Shevchenko", 123));

	public static Student getStudentByString(String s) {
		System.out.println("New service got request " + s);
		var student = students.get(s);
		System.out.println("Student returned : " + student);
		return student;
	}
}
