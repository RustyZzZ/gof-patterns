package edu.chnu.patterns.abstractFactory;

import lombok.Data;

@Data
public abstract class Log {
	private String subject;
	private Integer group;

	protected abstract void prepareLog();
}
