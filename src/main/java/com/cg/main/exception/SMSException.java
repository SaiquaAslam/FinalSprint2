package com.cg.main.exception;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
/**
*
* @author manasa
* 
* Exception class that handles all the exception raised by the seed module
*/

@ControllerAdvice
public class SMSException extends ResponseEntityExceptionHandler{
	/**
	 * ResponseEntity handles SeedNotFoundException withWEb request and
	 * returns the error details with Http status
	 * @param exception
	 * @param request
	 * @return
	 */
		@ExceptionHandler(SeedNotFoundException.class)
		public ResponseEntity<ErrorDetails> handleException(SeedNotFoundException exception, WebRequest request) {
			ErrorDetails details = new ErrorDetails(exception.getMessage(), LocalDate.now(), request.getDescription(false));
			return new ResponseEntity<ErrorDetails>(details, HttpStatus.NOT_FOUND);
		}
		
		/**
		 * ResponseEntity handles Method Argument NotValid with Method Argument NotValidException
		 * and HttpHeaders, HttpStatus and WebRequest
		 * returns error data with HttpStatus
		 * 
		 */
		protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
				HttpHeaders headers, HttpStatus status, WebRequest request) {

			Map<String, String> errors = new HashMap<>();
			ex.getBindingResult().getFieldErrors()
					.forEach(error -> errors.put(error.getField(), error.getDefaultMessage()));
			return new ResponseEntity<Object>(errors, HttpStatus.BAD_REQUEST);
		}
	}
