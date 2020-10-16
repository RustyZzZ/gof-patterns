package edu.chnu.patterns.composite;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Lab implements Evaluable {
	private int number;
	private int mark;

	@Override
	public int getSumOfMarksForBranches() {
		return mark;
	}
}
