package edu.chnu.patterns.abstractFactory;

import java.util.Arrays;
import java.util.Collections;

import edu.chnu.patterns.factoryMethod.LectureClass;
import edu.chnu.patterns.factoryMethod.UniversityClass;

public class LectureClassFactory extends UniversityClassFactory{

	@Override
	protected UniversityClass createClass(String subject, Integer group) {
		return new LectureClass(subject, Collections.singletonList(group));
	}

	@Override
	protected Log createLog() {
		return new VisitorLog();
	}
}
