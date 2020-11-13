package edu.chnu.patterns.memento;

import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {
		var diachuk = new Student("Diachuk", "642");
		var save = diachuk.save();
		try {
			var fullName = DataEnrichmentService.getFullName(diachuk.getName());
			diachuk.setName(fullName);

			var fullGroup = DataEnrichmentService.getFullGroup(diachuk.getGroup());
			diachuk.setGroup(fullGroup);
		} catch (NoSuchElementException e) {
			System.out.println("Rollbacked");
			diachuk.restore(save);
		}
		System.out.println(diachuk.toString());
	}
}
