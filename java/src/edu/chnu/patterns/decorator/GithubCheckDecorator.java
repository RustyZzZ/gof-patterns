package edu.chnu.patterns.decorator;

public class GithubCheckDecorator extends PlagiarismCheckerDecorator{
	public GithubCheckDecorator(PlagiarismChecking checker) {
		super(checker);
	}

	@Override
	public void checkForPlagiarism(String file) {
		this.checker.checkForPlagiarism(file);
		this.result = 5;
		System.out.println("Githab checked for plagiarism");
	}
}
