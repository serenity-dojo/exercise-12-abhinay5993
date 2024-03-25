package com.serenitydojo.exceptions;

public class MissingWelcomeFileException extends RuntimeException {

	public MissingWelcomeFileException(String strExpMsg, Throwable e) {
		super(strExpMsg, e);
	}

}