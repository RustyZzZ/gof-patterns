package edu.chnu.patterns.facade;

public class MarkServiceFacade {
	public Integer getMarkForStudentByName(String name) {
		var studentByString = NewDbService.getStudentByString(name);
		if (studentByString == null) {
			studentByString = OldDBService.getStudentByString(name);
		}
		var markService = new SuperPuperOldCoolMarkService();
		var mark = markService.getMarkByName(studentByString);
		mark.fixMark();

		return mark.getMark();
	}
}
