package edu.chnu.patterns.state;

public class VerifiedState implements State {
	private ModuleTest test;

	public VerifiedState(ModuleTest test){
		this.test = test;
	}

	@Override
	public void changeState() {
		System.out.println("It is the last status. No changes");
	}

	@Override
	public void getTask() {
		System.out.println("The task was blah blah blah");
	}

	@Override
	public void getAnswer() {
		System.out.println("The answer was blah blah blah");
	}

	@Override
	public void getMark() {
		System.out.println("Mark is 30/30");
	}
}
