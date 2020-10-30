package edu.chnu.patterns.facade;

import edu.chnu.domain.Student;
import lombok.AllArgsConstructor;
import lombok.Data;

public class SuperPuperOldCoolMarkService {

	public Mark getMarkByName(Student stud) {
		return new Mark(stud.getName().length() * 10);
	}

	@Data
	@AllArgsConstructor
	public static class Mark {
		private int mark;

		public void fixMark() {
			if (this.mark > 100) {
				this.mark = Double.valueOf(100 - (this.mark - 100) * Math.random()).byteValue();
			}
		}
	}


}
