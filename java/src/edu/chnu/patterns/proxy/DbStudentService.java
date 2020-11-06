package edu.chnu.patterns.proxy;

import java.util.Arrays;
import java.util.List;

import lombok.SneakyThrows;

public class DbStudentService implements StudentService {

	private static List<Student> students = Arrays.asList(
			Student.builder().name("Diachuk").group(new Group(2015, "Ivanov")).build(),
			Student.builder().name("Flint").group(new Group(2015, "Ivanov")).build(),
			Student.builder().name("Shevchenko").group(new Group(2015, "Ivanov")).build(),
			Student.builder().name("Petrov").group(new Group(2015, "Ivanov")).build()
	);

	@Override
	@SneakyThrows
	public Student getStudent(String name) {
		Thread.sleep(1000);
		var stud = students.stream()
						   .filter(student -> student.getName().equals(name))
						   .findFirst()
						   .orElseThrow();
		System.out.println("Found in DB" + stud.toString());
		return stud;
	}

	@Override
	public Student saveStudent(Student student) {
		students.add(student);
		return student;
	}
}
