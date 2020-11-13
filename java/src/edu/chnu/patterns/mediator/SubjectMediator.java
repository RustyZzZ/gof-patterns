package edu.chnu.patterns.mediator;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class SubjectMediator {
	private Lecturer lecturer;
	private Assistant assistant;
	private List<String> students;

	public void sendMessage(String name, String msg) {
		if (name.equals("^")) {
			System.out.println("Sent to lecturer message: " + msg);
		} else if (name.equals("*")) {
			students.forEach(stud -> System.out.println("Sent to " + stud + " message: " + msg));
			System.out.println("Sent to assistant message" + msg);
		} else {
			System.out.println("Sent to " + name + " message: " + msg);
		}
	}
}
