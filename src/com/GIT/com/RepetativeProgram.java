package com.GIT.com;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RepetativeProgram {
	// by the people for the people of the people
	public static void main(String[] args) {
		String s = "by the people for the people of the people";
		String[] split = s.split(" ");

		Map<String, Integer> m = new LinkedHashMap<String, Integer>();
		for (String kword : split) {
			if (m.containsKey(kword)) {
				Integer integer = m.get(kword);
				m.put(kword, integer + 1);
			}
			else {
				m.put(kword, 1);
			}
		}
		System.out.println(m);

		Set<Entry<String, Integer>> entrySet = m.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println(entry);
			}
		}

	}

}
