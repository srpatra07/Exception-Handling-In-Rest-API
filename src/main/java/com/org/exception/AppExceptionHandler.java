package com.org.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {
	
	@ExceptionHandler(value= UserNotFoundException.class)
	public ResponseEntity<ErrorInfo> userNFEHandler(UserNotFoundException e)
	{
		ErrorInfo info = new ErrorInfo();
		info.setCode("MSG002");
		info.setMsg(e.getMessage());
		info.setWhen(LocalDateTime.now());
		
		return new ResponseEntity<ErrorInfo>(info,HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value= Exception.class)
	public ResponseEntity<ErrorInfo> exceptionHandler(Exception e)
	{
		ErrorInfo info = new ErrorInfo();
		info.setCode("MSG001");
		info.setMsg(e.getMessage());
		info.setWhen(LocalDateTime.now());
		
		return new ResponseEntity<ErrorInfo>(info,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
