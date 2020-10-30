package edu.chnu.patterns.flyweight;

public class Student {
	private String name;
	private Group group;


	public Student(String name, Integer start_year, String curator) {
		this.name = name;
		this.group = GroupCache.get(start_year);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStart_year() {
		return group.getStart_year();
	}


	public String getCurator() {
		return group.getCurator();
	}

	public void setGroup(Group group) {
		this.group = group;
	}
}
