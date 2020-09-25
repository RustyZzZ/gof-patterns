package edu.chnu.patterns.factoryMethod;

import java.util.Arrays;

public class UniversityClassScheduler {
	public static void main(String[] args) {
		scheduleLectureAndLab("GOF ", 343);
	}

	/**
	 * Основна ціль методу це створити лекцію та лабораторне заняття для певної групи,
	 * та сповістити її
	 */
	private static void scheduleLectureAndLab(String subject, Integer group) {
		var factories = Arrays.asList(new LabClassFactory(), new LectureClassFactory());
		factories.stream()
				 .map(factory -> factory.createClass(subject, group))
				 .forEach(UniversityClass::notifyAttendee);
	}
}
