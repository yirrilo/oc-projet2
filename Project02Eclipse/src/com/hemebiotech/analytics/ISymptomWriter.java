package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;

public interface ISymptomWriter {

	void writeSymptoms(Map<String, Integer> countedSymptoms) throws IOException;

}
