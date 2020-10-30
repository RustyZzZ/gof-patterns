package edu.chnu.patterns.decorator;

public class ChnuPlagiarismChecker  implements PlagiarismChecking{
	@Override
	public void checkForPlagiarism(String file) {
		System.out.println("CHNU is checking for plagiarism");
	}
}
