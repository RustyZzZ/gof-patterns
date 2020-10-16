package edu.chnu.patterns.adapter;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements StudentModernDBRepository {
	private List<Student> students = new ArrayList<>();

	@Override
	public Student getById(String id) {
		return students.stream()
					   .filter(el -> el.getId().equals(id))
					   .findFirst()
					   .orElseThrow();
	}

	@Override
	public List<Student> getAll() {
		return students;
	}

	@Override
	public Student save(Student student) {
		students.add(student);
		return student;
	}

	@Override
	public void deleteById(String id) {
		var byId = getById(id);
		students.remove(byId);
	}

	@Override
	public void delete(Student student) {
		students.remove(student);
	}
}
