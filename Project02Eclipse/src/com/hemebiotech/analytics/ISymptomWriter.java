package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;

/**
 * Anything that will write symptom counter to a target.
 */
public interface ISymptomWriter {

	/**
	 * Write symptoms to a target. The given map hasa to contain symptoms as key and counter as value.
	 * @param countedSymptoms the map to be written.
	 * @throws IOException
	 */
	void writeSymptoms(Map<String, Integer> countedSymptoms) throws IOException;

}
