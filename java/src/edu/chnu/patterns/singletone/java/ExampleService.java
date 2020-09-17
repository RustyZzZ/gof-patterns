package edu.chnu.patterns.singletone.java;

import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.function.Consumer;
import java.util.function.Supplier;

import edu.chnu.domain.Student;

public class ExampleService {
	private final static CyclicBarrier gate = new CyclicBarrier(3);

	public static void sequentialExample(Consumer<Student> saveMethod, Supplier<List<Student>> getMethod) {
		var student1 = new Student("Diachuk R.", 643);
		var student2 = new Student("Ivanov I.", 343);
		saveMethod.accept(student1);
		saveMethod.accept(student2);
		var allStudents = getMethod.get();
		System.out.println(allStudents);
	}

	public static void asyncExample(Consumer<Student> saveMethod, Supplier<List<Student>> getMethod) {

		var student1 = new Student("Diachuk R.", 643);
		var student2 = new Student("Ivanov I.", 343);
		try {
			new Thread(() -> saveAndGetAllStudents(student1, saveMethod, getMethod)).start();
			new Thread(() -> saveAndGetAllStudents(student2, saveMethod, getMethod)).start();
			gate.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}

	}

	private static void saveAndGetAllStudents(Student student,
			Consumer<Student> saveMethod, Supplier<List<Student>> getMethod) {
		try {
			gate.await();
			saveMethod.accept(student);
			var allStudents = getMethod.get();
			System.out.println(allStudents);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
