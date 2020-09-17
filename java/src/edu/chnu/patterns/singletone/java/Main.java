package edu.chnu.patterns.singletone.java;

import java.util.List;

import edu.chnu.domain.Student;

public class Main {
	public static void main(String[] args) {
		var student1 = new Student("Diachuk R.", 643);
		var student2 = new Student("Ivanov I.", 343);
		saveStudent(student1);
		saveStudent(student2);
		var allStudents = getAllStudents();
		System.out.println(allStudents);
	}


	private static void saveStudent(Student student) {
		StudentDao.getInstance().saveStudent(student);
		//ThreadSafeStudentDao.getInstance().saveStudent(student);
	}

	private static List<Student> getAllStudents() {
		return StudentDao.getInstance().getAllStudents();
		//return ThreadSafeStudentDao.getInstance().getAllStudents();
	}

}
