package edu.chnu.patterns.state;

public class ModuleTest {
	private State state;
	private String studentName;
	private String task;
	private String answer;
	private int mark;

	public ModuleTest(String studentName) {
		this.studentName = studentName;
		this.task = "some very secrete task";
		this.answer = null;
		this.mark = 0;
		this.state = new CreatedState(this);
	}

	public String getStudentName() {
		return studentName;
	}

	public void getTask() {
		this.state.getTask();
	}

	public void getAnswer() {
		this.state.getAnswer();
	}

	public void getMark() {
		this.state.getMark();
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void changeState(){
		this.state.changeState();
	}
}
