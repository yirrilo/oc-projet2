package com.hemebiotech.analytics;

/**
 * Application aiming at counting a symptoms list.
 * If 2 arguments are provided, they are used as an input and an output filenames.
 *
 */
public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {
		String inputFilename = "Project02Eclipse/symptoms.txt";
		String outputFilename = "result.out";
		if(args.length == 2) {
			inputFilename = args[0];
			outputFilename = args[1];
		}
		ISymptomProcessor processor = new SymptomDataProcessor(inputFilename, outputFilename);
		processor.processSymptoms();
	}
}
