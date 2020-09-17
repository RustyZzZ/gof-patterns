package edu.chnu.patterns.singletone.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import edu.chnu.domain.Student;

public class StudentDao {
	private static StudentDao INSTANCE;
	private Set<Student> db; //db simulator

	private StudentDao() {
		db = new HashSet<>();
	}

	public static StudentDao getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new StudentDao();
		}
		return INSTANCE;
	}

	public void clear() {
		db.clear();
	}

	public void saveStudent(Student s) {
		db.add(s);
	}

	public List<Student> getAllStudents(){
		return new ArrayList<>(db);
	}
}
