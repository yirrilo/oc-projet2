package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Process data from a input file to produce a report.
 */
public class SymptomDataProcessor implements ISymptomProcessor{
	
	private String inputFilename;
	private String outputFilename;

	/**
	 * Processor of symptoms.
	 * @param inputFilename file to read.
	 * @param outputFilename file to produce.
	 */
	public SymptomDataProcessor(String inputFilename, String outputFilename) {
		this.inputFilename = inputFilename;
		this.outputFilename = outputFilename;
	}
	
	/**
	 *{@inheritDoc}
	 */
	@Override
	public void processSymptoms() throws IOException {
		ISymptomReader reader = new ReadSymptomDataFromFile(inputFilename);
		List<String> symptoms = reader.GetSymptoms();
		
		ISymptomCounter counter = new CountSymptomDataFromList();
		Map<String, Long> countedSymptoms = counter.countSymptoms(symptoms);
		
		ISymptomWriter writer = new WriteSymptomDataFromMap(outputFilename);
		writer.writeSymptoms(countedSymptoms);
	}
}
