package edu.chnu.patterns.mediator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Assistant {
	private SubjectMediator mediator;

	public void sendMessage(String name, String msg) {
		System.out.println("Assistant sent:");
		mediator.sendMessage(name, msg);
	}
}
