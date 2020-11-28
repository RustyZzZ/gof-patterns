package edu.chnu.patterns.state;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CreatedState implements State {
	private ModuleTest test;

	@Override
	public void changeState() {
		this.test.setState(new StartedState(this.test));
	}

	@Override
	public void getTask() {
		System.out.println("No task yet");
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
