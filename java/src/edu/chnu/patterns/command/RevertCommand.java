package edu.chnu.patterns.command;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RevertCommand implements Command {
	private GitService service;

	@Override
	public void execute() {
		service.revert(null);
	}
}
