package edu.chnu.patterns.command;

public class Main {

	public static void main(String[] args) {
		var editorController = new EditorController();
		editorController.processAction("INIT", null);
		editorController.processAction("COMMIT", "a");
		editorController.processAction("COMMIT", "as");
		editorController.processAction("REVERT", null);
		editorController.processAction("PUSH", null);

		editorController.getHistory();

		editorController.publishToGithub();
	}
}
