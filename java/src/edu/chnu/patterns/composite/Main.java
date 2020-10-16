package edu.chnu.patterns.composite;

import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		var java = new Subject("Java", Arrays.asList(
				new LearningModule(1, Arrays.asList(
						new Lab(1, 30),
						new Lab(2, 20))),
				new LearningModule(2, Collections.singletonList(
						new Lab(3, 50)))));
		var diachuk = new Student("Diachuk", Collections.singletonList(java));
		System.out.println(diachuk.getAverage());
	}
}
