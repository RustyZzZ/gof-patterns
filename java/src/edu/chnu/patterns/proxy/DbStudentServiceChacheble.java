package edu.chnu.patterns.proxy;

import java.util.ArrayList;
import java.util.List;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DbStudentServiceChacheble implements StudentService {
	private final StudentService service;
	private List<Student> cache = new ArrayList<>();

	@Override
	public Student getStudent(String name) {
		System.out.println("Looking for " + name + " in cache");
		var studentOptional = cache.stream().filter(el -> el.getName().equals(name))
								   .findFirst();
		if (studentOptional.isPresent()) {
			System.out.println("Found in cache" + name);
			return studentOptional.get();
		}

		var student = service.getStudent(name);
		if (student != null) {
			cache.add(student);
		}
		return student;
	}

	@Override
	public Student saveStudent(Student student) {
		cache.add(student);
		service.saveStudent(student);
		return student;
	}
}
