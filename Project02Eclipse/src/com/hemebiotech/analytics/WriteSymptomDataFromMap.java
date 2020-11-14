package com.hemebiotech.analytics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Class used to serialize a map of symptoms counter.
 */
public class WriteSymptomDataFromMap implements ISymptomWriter {

	private String outputFilename;

	/**
	 * Writer of symptoms having to write the result to the given output path.
	 * @param outputFilename filename to use to write the result.
	 */
	public WriteSymptomDataFromMap(String outputFilename) {
		this.outputFilename = outputFilename;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void writeSymptoms(Map<String, Long> countedSymptoms) throws IOException {
		List<String> content = countedSymptoms.entrySet().stream()
				.map( entry -> entry.getKey() + ": " + entry.getValue())
				.collect(Collectors.toList());
		Files.write(Path.of(outputFilename), content, StandardOpenOption.TRUNCATE_EXISTING);
	}

}
