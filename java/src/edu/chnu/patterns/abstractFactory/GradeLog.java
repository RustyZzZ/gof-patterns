package edu.chnu.patterns.abstractFactory;

import java.util.HashMap;
import java.util.Map;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = true)
public class GradeLog extends Log {
	Map<String, String> grades = new HashMap<>();

	@Override
	protected void prepareLog() {
		System.out.println("GradeLog is prepared for Lab Class");
	}
}
