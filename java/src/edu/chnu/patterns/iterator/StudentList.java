package edu.chnu.patterns.iterator;

import java.util.Iterator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentList  implements Iterable<StudentListNode>{
	private StudentListNode start;

	public StudentListNode getIterator() {
		return start;
	}

	@Override
	public Iterator<StudentListNode> iterator() {
		return start;
	}
}
