package edu.chnu.patterns.proxy;

public interface StudentService {
	Student getStudent(String name);

	Student saveStudent(Student student);
}
