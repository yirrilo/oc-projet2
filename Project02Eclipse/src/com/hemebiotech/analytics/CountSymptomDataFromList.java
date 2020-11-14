package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountSymptomDataFromList implements ISymptomCounter {

	@Override
	public Map<String, Integer> countSymptoms(List<String> symptoms) {
		Map<String, Integer> countedSymptoms = new HashMap<>();
		for (String symptom : symptoms) {
			System.out.println("symptom from file: " + symptom);
			if (symptom.equals("headache")) {
				Integer count = countedSymptoms.get("headache");
				count = count == null ? 1 : count + 1;
				countedSymptoms.put("headache", count);
			}
			else if (symptom.equals("rash")) {
				Integer count = countedSymptoms.get("rash");
				count = count == null ? 1 : count + 1;
				countedSymptoms.put("rash", count);
			}
			else if (symptom.contains("pupils")) {
				Integer count = countedSymptoms.get("pupils");
				count = count == null ? 1 : count + 1;
				countedSymptoms.put("pupils", count);
			}
		}
		return countedSymptoms;
	}

}
