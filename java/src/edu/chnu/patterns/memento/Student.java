package edu.chnu.patterns.memento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	private String name;
	private String group;


	public StudentMemento save() {
		return new StudentMemento(name, group);
	}

	public void restore(StudentMemento mem) {
		this.name = mem.name;
		this.group = mem.group;
	}

	@AllArgsConstructor
	@NoArgsConstructor
	class StudentMemento {
		private String name;
		private String group;
	}
}
