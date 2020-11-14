package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

public class WriteSymptomDataFromMap implements ISymptomWriter {

	private String outputFilename;

	public WriteSymptomDataFromMap(String outputFilename) {
		this.outputFilename = outputFilename;
	}

	@Override
	public void writeSymptoms(Map<String, Long> countedSymptoms) throws IOException {
		FileWriter writer = new FileWriter(outputFilename);
		for ( Entry<String, Long> symptomEntry : countedSymptoms.entrySet()) {
			writer.write(symptomEntry.getKey() + ": " + symptomEntry.getValue() + "\n");
		}
		writer.close();
	}

}
