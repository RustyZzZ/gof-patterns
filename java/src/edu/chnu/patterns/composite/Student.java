package edu.chnu.patterns.composite;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
	private String name;
	private List<Subject> subjects;

	public double getAverage() {
		var s = 0;
		for (Subject subject : subjects) {
			s += subject.getSumOfMarksForBranches();
		}
		return s / (subjects.size() * 1.0);
	}
}
