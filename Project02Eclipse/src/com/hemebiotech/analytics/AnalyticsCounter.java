package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnalyticsCounter {
	
	public static void main(String args[]) throws Exception {
		ISymptomReader reader = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		List<String> symptoms = reader.GetSymptoms();
		
		ISymptomCounter counter = new CountSymptomDataFromList();
		Map<String, Integer> countedSymptoms = counter.countSymptoms(symptoms);
		
		FileWriter writer = new FileWriter ("result.out");
		writer.write("headache: " + countedSymptoms.get("headache") + "\n");
		writer.write("rash: " + countedSymptoms.get("rash") + "\n");
		writer.write("dialated pupils: " + countedSymptoms.get("pupils") + "\n");
		writer.close();
	}
}
