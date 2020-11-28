package edu.chnu.patterns.observer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssistantSubscriber implements Subscriber {
	private String name;

	@Override
	public void processUpdate(String update) {
		System.out.println("Assistant" + name + " processed update " + update);
	}
}
