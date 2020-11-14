package com.hemebiotech.analytics;

import java.io.FileWriter;
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
		
		FileWriter writer = new FileWriter ("result.out");
		writer.write("headache: " + countedSymptoms.get("headache") + "\n");
		writer.write("rash: " + countedSymptoms.get("rash") + "\n");
		writer.write("dialated pupils: " + countedSymptoms.get("pupils") + "\n");
		writer.close();
	}
}
