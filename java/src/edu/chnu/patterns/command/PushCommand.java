package edu.chnu.patterns.command;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PushCommand implements Command {
	private GitService service;

	@Override
	public void execute() {
		service.push(null);
	}
}
