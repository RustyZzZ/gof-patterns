package edu.chnu.patterns.flyweight;

public class Main {
	public static void main(String[] args) {
		GroupCache.addGroup(new Group(2015, "Ivanov"));
		var diachuk = new Student("Diachuk", 2015, "Ivanov");
		System.out.println(diachuk.getName() + " " + diachuk.getStart_year() + " " + diachuk.getCurator());
	}
}
