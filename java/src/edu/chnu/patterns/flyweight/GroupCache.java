package edu.chnu.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class GroupCache {
	public static Map<Integer, Group> cache = new HashMap<>();

	public static void addGroup(Group group) {
		cache.put(group.getStart_year(), group);
	}

	public static void removeGroup(Integer startYear) {
		cache.remove(startYear);
	}

	public static Group get(Integer startYear) {
		var group = cache.get(startYear);
		if (group == null) {
			var newGroup = new Group(startYear, "");
			cache.put(newGroup.getStart_year(), newGroup);
			return newGroup;
		}
		return group;
	}
}
