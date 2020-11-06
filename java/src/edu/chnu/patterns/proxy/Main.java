package edu.chnu.patterns.proxy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static DbStudentService service = new DbStudentService();
	private static DbStudentServiceChacheble newService = new DbStudentServiceChacheble(service);

	public static void main(String[] args) {
		var names = Arrays.asList("Diachuk", "Shevchenko", "Flint", "Petrov");
		getStudentsByNames(names);
		getStudentsByNames(names);

		getStudentsByNamesCached(names);
		getStudentsByNamesCached(names);
	}

	private static List<Student> getStudentsByNames(List<String> names) {
		return names.stream()
					.map(el -> service.getStudent(el))
					.collect(Collectors.toList());
	}
	private static List<Student> getStudentsByNamesCached(List<String> names){
		return names.stream()
					.map(el -> newService.getStudent(el))
					.collect(Collectors.toList());
	}
}
