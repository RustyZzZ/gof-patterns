package edu.chnu.patterns.state;

public class Main {
	public static void main(String[] args) {
		var diachukModule = new ModuleTest("Diachuk"); // created
		diachukModule.getTask();

		diachukModule.changeState(); // started
		diachukModule.getTask();
		diachukModule.getAnswer();

		diachukModule.changeState(); // submitted
		diachukModule.getAnswer();
		diachukModule.getMark();

		diachukModule.changeState(); // Verified
		diachukModule.getMark();
	}
}
