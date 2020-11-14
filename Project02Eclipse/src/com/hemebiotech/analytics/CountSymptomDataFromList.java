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
			Integer count = countedSymptoms.get(symptom);
			count = count == null ? 1 : count + 1;
			countedSymptoms.put(symptom, count);
		}
		return countedSymptoms;
	}

}
