package edu.chnu.patterns.observer;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentSubscriber implements Subscriber {
	private String name;
	private int group;

	@Override
	public void processUpdate(String update) {
		System.out.println("Student" + name + "from group" + group + " processed update " + update);
	}
}
