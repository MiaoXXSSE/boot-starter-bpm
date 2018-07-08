package com.miao.boot.bpm.commom.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class BadRequestException extends Exception {
	
	private static final long serialVersionUID = -1530544324832622341L;
	
	private String message;

	public BadRequestException(String message) {
		super(message);
		this.message = message;
	}
	
	public BadRequestException(String message, Throwable cause) {
        super(message, cause);
        this.message = message;
    }
	
	public BadRequestException(Throwable cause) {
        super(cause);
    }
	
}
