package edu.chnu.patterns.chainOfResponsibities;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class BasePlagiarismChecker implements PlagiarismChecking {
	private BasePlagiarismChecker next;

	public BasePlagiarismChecker(BasePlagiarismChecker next) {
		this.next = next;
	}
}
