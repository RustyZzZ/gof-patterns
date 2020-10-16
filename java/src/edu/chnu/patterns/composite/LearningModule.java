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
public class LearningModule implements Evaluable {
	private int num;
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
