package edu.chnu.patterns.factoryMethod;

public abstract class UniversityClassFactory {
	protected abstract UniversityClass createClass(String subject, Integer group);
}
