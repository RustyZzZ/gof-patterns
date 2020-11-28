package edu.chnu.patterns.strategy;

public class UnicheckChecker implements PlagiarismChecking {
	@Override
	public void checkForPlagiarism(Document file) {
		System.out.println("Unicheck checked. 95% originality");
	}
}
