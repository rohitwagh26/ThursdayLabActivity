package com.question2;

public class InsufficientBalanceException extends Exception {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
    
    public InsufficientBalanceException(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
	
	

	
		
		
	}

}