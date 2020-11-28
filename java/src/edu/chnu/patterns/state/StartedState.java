package edu.chnu.patterns.state;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class StartedState implements State {
	private ModuleTest test;

	@Override
	public void changeState() {
		this.test.setState(new SubmittedState(this.test));
	}

	@Override
	public void getTask() {
		System.out.println("The task is blah blah blah");
	}

	@Override
	public void getAnswer() {
		System.out.println("No answer yet");
	}

	@Override
	public void getMark() {
		System.out.println("No mark yet");
	}
}
