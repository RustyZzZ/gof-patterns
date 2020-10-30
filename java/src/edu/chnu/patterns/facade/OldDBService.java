package edu.chnu.patterns.facade;

import java.util.Map;

import edu.chnu.domain.Student;

public class OldDBService {
	private static Map<String, Student> students = Map.of("Diachuk", new Student("Diachuk", 123));

	public static Student getStudentByString(String s) {
		System.out.println("Old service got request " + s);
		var student = students.get(s);
		System.out.println("Student returned : " + student);
		return students.get(s);
	}
}
