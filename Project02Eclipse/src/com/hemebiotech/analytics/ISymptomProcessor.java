package com.hemebiotech.analytics;

import java.io.IOException;

/**
 * Organize the report from symptoms data.
 */
public interface ISymptomProcessor {

	/**
	 * Uses to get symptoms data to produce a report.
	 * @throws IOException
	 */
	void processSymptoms() throws IOException;

}
