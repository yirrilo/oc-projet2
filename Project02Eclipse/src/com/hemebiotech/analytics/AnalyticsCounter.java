package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnalyticsCounter {
	
	public static void main(String args[]) throws Exception {
		ISymptomReader reader = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		List<String> symptoms = reader.GetSymptoms();
		
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
		
		ISymptomWriter writer = new WriteSymptomDataFromMap("result.out");
		writer.writeSymptoms(countedSymptoms);
	}
}
