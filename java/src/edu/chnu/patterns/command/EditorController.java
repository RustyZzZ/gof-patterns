package edu.chnu.patterns.command;

import java.util.ArrayList;
import java.util.List;

public class EditorController {
	private static final GitService git = new GitService();
	private static List<Command> commands = new ArrayList<>();

	public String processAction(String action, String project) {
		switch (Actions.valueOf(action)) {
			case INIT:
				commands.add(() -> git.init(null));
				break;
			case COMMIT:
				commands.add(() -> git.commit(project));
				break;
			case REVERT:
				commands.add(()-> git.revert(null));
				break;
			case PUSH:
				commands.add(new PushCommand(git));
				break;
			default:
				throw new UnsupportedOperationException();
		}
		return project;
	}

	public void publishToGithub() {
		commands.forEach(Command::execute);
		System.out.println("Code is on github now");
	}

	public void getHistory() {
		commands.forEach(System.out::println);
	}

	enum Actions {
		COMMIT, REVERT, PUSH, INIT
	}
}
