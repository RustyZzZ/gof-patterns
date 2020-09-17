package edu.chnu.domain;

public class Student implements Comparable<Student> {
	private String name;
	private Integer group;

	public Student(String name, Integer group) {
		this.name = name;
		this.group = group;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getGroup() {
		return group;
	}

	public void setGroup(Integer group) {
		this.group = group;
	}

	@Override
	public String toString() {
		return "Student{name='" + name + "'group=" + group + '}';
	}

	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.getName());
	}
}
