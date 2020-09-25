package edu.chnu.patterns.abstractFactory;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class VisitorLog extends Log {
	List<String> present;
	@Override
	protected void prepareLog() {
		System.out.println("VisitorLog is prepared for Lecture");
	}
}
