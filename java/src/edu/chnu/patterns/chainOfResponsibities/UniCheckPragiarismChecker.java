package edu.chnu.patterns.chainOfResponsibities;

import lombok.AllArgsConstructor;


public class UniCheckPragiarismChecker extends BasePlagiarismChecker {
	public UniCheckPragiarismChecker(BasePlagiarismChecker next) {
		super(next);
	}

	@Override
	public void checkForPlagiarism(Document file) {
		if (file.getText() != null) {
			System.out.println("UniCheck is checking code for plagiarism");
		}
		if (this.getNext() != null) {
			this.getNext().checkForPlagiarism(file);
		}
	}

}
