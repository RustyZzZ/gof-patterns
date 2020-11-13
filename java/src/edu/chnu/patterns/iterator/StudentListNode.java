package edu.chnu.patterns.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentListNode implements Iterator<StudentListNode> {
	private Student current;
	private StudentListNode next;


	/*@Override
	public Boolean hasNext() {
		return next != null;
	}*/

	@Override
	public boolean hasNext() {
		return next != null;
	}

	@Override
	public StudentListNode next() {
		if (this.hasNext()) {
			return next;
		}
		throw new NoSuchElementException("dont have next");
	}

/*	@Override
	public StudentListNode getNext() {
		if (this.hasNext()) {
			return next;
		}
		throw new NoSuchElementException("dont have next");
	}*/
}
