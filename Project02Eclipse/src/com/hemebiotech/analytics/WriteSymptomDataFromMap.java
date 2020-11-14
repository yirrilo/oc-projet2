package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteSymptomDataFromMap implements ISymptomWriter {

	private String outputFilename;

	public WriteSymptomDataFromMap(String outputFilename) {
		this.outputFilename = outputFilename;
	}

	@Override
	public void writeSymptoms(Map<String, Integer> countedSymptoms) throws IOException {
		FileWriter writer = new FileWriter(outputFilename);
		writer.write("headache: " + countedSymptoms.get("headache") + "\n");
		writer.write("rash: " + countedSymptoms.get("rash") + "\n");
		writer.write("dialated pupils: " + countedSymptoms.get("pupils") + "\n");
		writer.close();
	}

}
