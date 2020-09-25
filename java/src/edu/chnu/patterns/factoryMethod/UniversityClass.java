package edu.chnu.patterns.factoryMethod;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class UniversityClass {
	private String subject;

	public abstract void notifyAttendee();
}
