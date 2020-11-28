package edu.chnu.patterns.strategy;

public class GHChecker implements PlagiarismChecking {
	@Override
	public void checkForPlagiarism(Document file) {
		System.out.println("GH checked. 90% originality");
	}
}
