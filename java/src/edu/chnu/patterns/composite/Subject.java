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
public class Subject implements Evaluable{
	private String name;
	private List<Evaluable> children;

	@Override
	public int getSumOfMarksForBranches() {
		int sum = 0;
		for (Evaluable child : children) {
			sum += child.getSumOfMarksForBranches();
		}
		return sum;
	}
}
