package edu.chnu.patterns.singletone.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import edu.chnu.domain.Student;

public enum EnumSingleton {
	INSTANCE;

	private Set<Student> db;

	private EnumSingleton() {
		db = new HashSet<>();
	}

	public void saveStudent(Student s) {
		db.add(s);
	}

	public List<Student> getAllStudents(){
		return new ArrayList<>(db);
	}
}
