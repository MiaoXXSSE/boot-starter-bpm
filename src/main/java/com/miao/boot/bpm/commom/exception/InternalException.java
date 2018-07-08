package com.miao.boot.bpm.commom.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class InternalException extends RuntimeException {

	private static final long serialVersionUID = 6525603017930561413L;
	
	private String message;

	public InternalException(String message) {
		super(message);
		this.message = message;
	}
	
	public InternalException(String message, Throwable cause) {
        super(message, cause);
        this.message = message;
    }
	
	public InternalException(Throwable cause) {
        super(cause);
    }
	
}
