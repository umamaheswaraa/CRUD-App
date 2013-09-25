package com.imaginea.crud.exception;

/**
 * @author umamaheswaraa
 *
 */
public class CRUDException extends Exception {

	private static final long serialVersionUID = -6709003962271214129L;

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public CRUDException(String message){
		this.message=message;
	}
	

}
