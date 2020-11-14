package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * Anything able to transform a symptoms list into a Map with the symptoms as key and a counter as value.
 */
public interface ISymptomCounter {

	/**
	 * Count the symptoms and creates a Map with the symptoms as key and a counter as value.
	 * @param symptoms list of symptoms.
	 * @return the map with counters.
	 */
	Map<String, Long> countSymptoms(List<String> symptoms);
}
