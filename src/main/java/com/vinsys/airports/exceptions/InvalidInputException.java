package com.vinsys.airports.exceptions;

/**
 * @author Nilesh Devdas
 * @version 1.0
 * @since 1.0
 */
public class InvalidInputException extends Exception {
    /**
     * Default Constructor
     */
    public InvalidInputException() {
    }

    /**
     * Overridden Message Constructor to pass message
     * @param message
     */
    public InvalidInputException(String message) {
        super(message);
    }

}
