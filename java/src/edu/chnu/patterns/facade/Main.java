package edu.chnu.patterns.facade;

public class Main {
	public static void main(String[] args) {
		var markServiceFacade = new MarkServiceFacade();
		var mark = markServiceFacade.getMarkForStudentByName("Diachuk");
		System.out.println(mark);
	}
}
