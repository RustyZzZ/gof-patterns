package edu.chnu.patterns.factoryMethod;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class LabClass extends UniversityClass {
	private Integer attendeeGroup;

	public LabClass(String subject, int group) {
		super(subject);
		this.attendeeGroup = group;
	}

	@Override
	public void notifyAttendee() {
		System.out.println(this.attendeeGroup + " group will have LAB " + this.getSubject());
		System.out.println("________________________________________");
	}

}
