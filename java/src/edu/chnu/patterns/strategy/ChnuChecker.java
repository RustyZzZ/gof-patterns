package edu.chnu.patterns.strategy;

public class ChnuChecker implements PlagiarismChecking {
	@Override
	public void checkForPlagiarism(Document file) {
		System.out.println("Chnu checked. 93% originality");
	}
}
