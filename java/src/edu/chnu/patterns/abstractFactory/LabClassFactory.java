package edu.chnu.patterns.abstractFactory;

import edu.chnu.patterns.factoryMethod.LabClass;

public class LabClassFactory extends UniversityClassFactory{
	protected LabClass createClass(String subject, Integer group) {
		return new LabClass(subject, group);
	}

	@Override
	protected Log createLog() {
		return new GradeLog();
	}
}
