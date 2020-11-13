package edu.chnu.patterns.iterator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Student {
	private String id;
	private String name;
	private Integer groupNumber;
}
