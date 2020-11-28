package edu.chnu.patterns.state;

public class SubmittedState implements State {
	private ModuleTest test;

	public SubmittedState(ModuleTest test){
		this.test = test;
	}


	@Override
	public void changeState() {
		this.test.setState(new VerifiedState(this.test));
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
		System.out.println("No marks yet.");
	}
}
