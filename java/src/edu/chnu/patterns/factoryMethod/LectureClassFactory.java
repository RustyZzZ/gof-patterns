package edu.chnu.patterns.factoryMethod;

import java.util.Arrays;
import java.util.Collections;

public class LectureClassFactory extends UniversityClassFactory{
	public LectureClass createClass(String subject, Integer group) {
		return new LectureClass(subject, Collections.singletonList(group));
	}
}
