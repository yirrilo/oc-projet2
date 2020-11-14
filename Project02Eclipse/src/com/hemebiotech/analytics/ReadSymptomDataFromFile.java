package com.hemebiotech.analytics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * Read the list of symptoms from a file.
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	/**
	 * Path of the file to get symptoms from.
	 */
	private String filepath;

	/**
	 * Constructs a reader which has to read the file at the given path.
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public ReadSymptomDataFromFile(String filepath) {
		this.filepath = filepath;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<String> GetSymptoms() throws IOException {
		if (filepath == null) {
			return List.of();
		}
		return Files.readAllLines(Path.of(filepath));
	}
}
