package edu.chnu.patterns.factoryMethod;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class LectureClass extends UniversityClass {
	private List<Integer> attendeeGroups;


	public LectureClass(String subject, List<Integer> attendeeGroups) {
		super(subject);
		this.attendeeGroups = attendeeGroups;
	}

	@Override
	public void notifyAttendee() {
		attendeeGroups.forEach(this::notify);
		System.out.println("________________________________________");
	}

	private void notify(Integer group) {
		System.out.println(group + " group will have LECTURE " + this.getSubject());
	}
}



