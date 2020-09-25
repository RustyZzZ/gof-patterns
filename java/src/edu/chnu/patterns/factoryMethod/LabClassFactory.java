package edu.chnu.patterns.factoryMethod;

public class LabClassFactory extends UniversityClassFactory{
	protected LabClass createClass(String subject, Integer group) {
		return new LabClass(subject,group);
	}
}
