package edu.chnu.patterns.command;

public class GitService {
	public String commit(String project) {
		System.out.println("Change committed");
		return project;
	}

	public String push(String project) {
		System.out.println("Changes pushed");
		return project;
	}

	public String revert(String project) {
		System.out.println("Last change reverted");
		return project;
	}

	public String init(String project) {
		System.out.println("Project initialized");
		return project;
	}
}
