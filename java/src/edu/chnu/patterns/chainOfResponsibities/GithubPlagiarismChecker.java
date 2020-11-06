package edu.chnu.patterns.chainOfResponsibities;

import lombok.AllArgsConstructor;

public class GithubPlagiarismChecker extends BasePlagiarismChecker {
	public GithubPlagiarismChecker(BasePlagiarismChecker next) {
		super(next);
	}

	@Override
	public void checkForPlagiarism(Document file) {
		if (file.getCode() != null) {
			System.out.println("Github is checking code for plagiarism");
		}
		if (this.getNext() != null) {
			this.getNext().checkForPlagiarism(file);
		}
	}
}
