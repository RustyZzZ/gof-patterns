package edu.chnu.patterns.chainOfResponsibities;

import lombok.AllArgsConstructor;
import lombok.Data;


public class ChnuPlagiarismChecker extends BasePlagiarismChecker {
	public ChnuPlagiarismChecker(BasePlagiarismChecker next) {
		super(next);
	}

	@Override
	public void checkForPlagiarism(Document file) {
		System.out.println("Chnu is checking code for plagiarism");
		if (this.getNext() != null) {
			this.getNext().checkForPlagiarism(file);
		}
	}
}
