package edu.chnu.patterns.mediator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Lecturer {
	private SubjectMediator mediator;


	public void sendMessage(String msg) {
		System.out.println("Lecturer sent:");
		mediator.sendMessage("*", msg);
	}
}
