package edu.chnu.patterns.command;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CommitCommand implements Command {
	private GitService service;
	private String change;

	@Override
	public void execute() {
		service.commit(change);
	}
}
