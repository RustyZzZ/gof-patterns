package edu.chnu.patterns.adapter;

import java.util.List;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LegacyDbToNewAdapter implements StudentModernDBRepository {
	private LegacyStudentRepository repo;

	@Override
	public Student getById(String id) {
		return repo.getById(id);
	}

	@Override
	public List<Student> getAll() {
		return repo.getAll();
	}

	@Override
	public Student save(Student student) {
		return repo.save(student);
	}

	@Override
	public void deleteById(String id) {
		repo.deleteById(id);
	}

	@Override
	public void delete(Student student) {
		repo.getById(student.getId());
	}
}
