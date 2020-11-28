package edu.chnu.patterns.templateMethod;

public class Main {
	public static void main(String[] args) {
		var java = new LectureClass("Java");
		var python = new PracticalClass("Python");
		java.startClass();
		python.startClass();
	}
}
