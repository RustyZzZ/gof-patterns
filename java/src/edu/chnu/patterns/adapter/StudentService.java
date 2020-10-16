package edu.chnu.patterns.adapter;

import java.util.List;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class StudentService {
	private StudentModernDBRepository repo;

	public Student getById(String id) {
		return repo.getById(id);
	}

	public List<Student> getAll() {
		return repo.getAll();
	}

	public Student save(Student student) {
		return repo.save(student);
	}

	public void deleteById(String id) {
		repo.deleteById(id);
	}

	public void delete(Student student) {
		repo.delete(student);
	}
}
