package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnalyticsCounter {
	
	public static void main(String args[]) throws Exception {
		ISymptomReader reader = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		List<String> symptoms = reader.GetSymptoms();
		
		ISymptomCounter counter = new CountSymptomDataFromList();
		Map<String, Long> countedSymptoms = counter.countSymptoms(symptoms);
		
		ISymptomWriter writer = new WriteSymptomDataFromMap("result.out");
		writer.writeSymptoms(countedSymptoms);
	}
}
