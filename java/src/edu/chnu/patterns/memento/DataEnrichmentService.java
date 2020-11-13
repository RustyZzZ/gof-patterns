package edu.chnu.patterns.memento;

import java.util.Map;
import java.util.NoSuchElementException;

public class DataEnrichmentService {
	private static Map<String, String> fullNames = Map.of("Diachuk", "Diachuk Rostyslav Lubomyrovych",
														  "Ivanov", "Ivanov Ivan Ivanovych");

	private static Map<String, String> fullGroup = Map.of("643", "643 PZKS", "641", "641 KN");

	public static String getFullName(String lastname) {
		var fullName = fullNames.get(lastname);
		if (fullName == null) {
			throw new NoSuchElementException("No lastname:" + lastname + ":in DB");
		}
		return fullName;
	}

	public static String getFullGroup(String group) {
		var full = fullGroup.get(group);
		if (full == null) {
			throw new NoSuchElementException("No group:" + group + ":in DB");
		}
		return full;
	}
}
