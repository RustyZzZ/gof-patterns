package edu.chnu.patterns.strategy;

import lombok.Data;

@Data
public class Checker {
	private PlagiarismChecking strategy;

	public void executeCheck(Document document){
		strategy.checkForPlagiarism(document);
	}
}
