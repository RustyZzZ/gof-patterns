package edu.chnu.patterns.iterator;

public class Main {
	public static void main(String[] args) {
		var students = new StudentList(
				new StudentListNode(
						new Student("1", "Diachuk", 643),
						new StudentListNode(
								new Student("2", "Diachuk2", 543),
								new StudentListNode(new Student("3", "Diachuk3", 443), null))));
		var iterator = students.getIterator();
		do {
			//System.out.println(iterator.getCurrent());
			if (!iterator.hasNext()) {
				break;
			}
			iterator = iterator.getNext();
		} while (true);


	}
}
