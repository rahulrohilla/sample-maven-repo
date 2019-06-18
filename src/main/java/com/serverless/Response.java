package com.serverless;

import java.util.Map;

public class Response {

	private final String message;
	private final String input;

	public Response(String message, Map<String, Object> input) {
		this.message = message;
		this.input = (String) input.get("body");
	}

	public String getMessage() {
		return this.message;
	}

	public String getInput() {
		return this.input;
	}
}
