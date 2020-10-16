package edu.chnu.patterns.adapter;

import java.util.ArrayList;
import java.util.List;

public class LegacyStudentRepository {
	private List<Student> legacyStudents = new ArrayList<>();

	public Student getById(String id) {
		return legacyStudents.stream()
							 .filter(el -> el.getId().equals(id))
							 .findFirst()
							 .orElseThrow();
	}

	public List<Student> getAll() {
		return legacyStudents;
	}

	public Student save(Student student) {
		legacyStudents.add(student);
		return student;
	}

	public void deleteById(String id) {
		var byId = getById(id);
		legacyStudents.remove(byId);
	}

}
