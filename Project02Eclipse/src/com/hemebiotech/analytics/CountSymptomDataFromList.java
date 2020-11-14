package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Counter of symptoms from a list.
 */
public class CountSymptomDataFromList implements ISymptomCounter {

	/**
	 *{@inheritDoc}
	 */
	@Override
	public Map<String, Long> countSymptoms(List<String> symptoms) {
		return symptoms.stream().collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()));
	}

}
