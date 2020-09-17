package edu.chnu.patterns.prototype;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static final String SUBJECT_NAME = "GOF Patterns";
	public static final String TEACHER = "Diachuk";
	public static final LocalDateTime TIME = LocalDateTime.now();

	public static void main(String[] args) {
		var initialLecture = getLectureClass();
		var initialLab = getLabClass();
		var classes = Arrays.asList(initialLecture, initialLab);

		var collect = new ArrayList<UniversityClass>();
		for (UniversityClass universityClass : classes) {
			List<UniversityClass> universityClasses = scheduleForNextMonth(universityClass);
			collect.addAll(universityClasses);
		}

		collect.forEach(UniversityClass::notifyAttendee);
	}

	private static List<UniversityClass> scheduleForNextMonth(UniversityClass cl) {
		var scheduledList = new ArrayList<UniversityClass>();
		for (int i = 0; i < 4; i++) {
			var copiedCl = cl.copy();
			copiedCl.setTime(cl.getTime().plus(i+1, ChronoUnit.WEEKS));
			scheduledList.add(copiedCl);
		}

		return scheduledList;
	}

	private static LabClass getLabClass() {
		return new LabClass(SUBJECT_NAME, TEACHER, TIME, 343);
	}

	private static LectureClass getLectureClass() {
		return new LectureClass(SUBJECT_NAME, TEACHER, TIME, Arrays.asList(243, 241, 343));
	}


}
