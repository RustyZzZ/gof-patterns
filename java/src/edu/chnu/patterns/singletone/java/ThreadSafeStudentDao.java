package edu.chnu.patterns.singletone.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

import edu.chnu.domain.Student;

public class ThreadSafeStudentDao {
	private static volatile ThreadSafeStudentDao INSTANCE;
	private Set<Student> db; //db simulator

	private ThreadSafeStudentDao() {
		db = new ConcurrentSkipListSet<>();
	}


	public static ThreadSafeStudentDao getInstance() {
		ThreadSafeStudentDao result = INSTANCE;
		if (result != null) {
			return result;
		}
		synchronized (ThreadSafeStudentDao.class) {
			if (INSTANCE == null) {
				INSTANCE = new ThreadSafeStudentDao();
			}
			return INSTANCE;
		}
	}
	public void saveStudent(Student s) {
		db.add(s);
	}

	public List<Student> getAllStudents(){
		return new ArrayList<>(db);
	}

	public void clear() {
		db.clear();
	}
}
