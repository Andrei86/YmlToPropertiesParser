package com.shalkevich.andrei.intexProject.Parser.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Exception to indicate an error of a lack of .properties file
 * 
 * @author Andrei Shalkevich
 */
@Getter
@AllArgsConstructor
public class PropertiesFileNotFoundException extends Exception {
  private String message;
}
