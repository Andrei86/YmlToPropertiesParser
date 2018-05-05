package com.shalkevich.andrei.ymlToPropertiesParser.exceptions;

import java.io.IOException;


/**
 * Class for MyFileNotFoundException
 * @author Andrei Shalkevich
 */
public class MyFileNotFoundException extends IOException{
	
	/**
	 * Message field
	 */
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * Constructor - new object creating with message value
	 * @param message - message from exception
	 */
	public MyFileNotFoundException(String message) {
		super();
		this.message = message;
	}

}
