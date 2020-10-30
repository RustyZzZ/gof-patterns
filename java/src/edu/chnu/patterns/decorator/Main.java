package edu.chnu.patterns.decorator;

public class Main {
	public static void main(String[] args) {
		var checker = new UniCheckDecorator(new GithubCheckDecorator(new ChnuPlagiarismChecker()));
		checker.checkForPlagiarism("file");
		System.out.println(checker.result);
	}

}
