package com.demo.project.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

@ExceptionHandler(CustomerAlreadyExists.class)
public ResponseEntity<ErrorMsg> customerAlredayExistsException(CustomerAlreadyExists e) {
ErrorMsg errorMsg=new ErrorMsg();
errorMsg.setMessage(e.getMessage());
return new ResponseEntity<ErrorMsg>(errorMsg,HttpStatus.OK);
}

@ExceptionHandler(CustomerLoginInvalid.class)
public ResponseEntity<ErrorMsg> customerLoginInvalidException(CustomerLoginInvalid e) {
ErrorMsg errorMsg=new ErrorMsg();
errorMsg.setMessage(e.getMessage());
return new ResponseEntity<ErrorMsg>(errorMsg,HttpStatus.OK);
}

@ExceptionHandler(CustomerPaswInvalid.class)
public ResponseEntity<ErrorMsg> CustomerPaswInvalidException(CustomerPaswInvalid e) {
ErrorMsg errorMsg=new ErrorMsg();
errorMsg.setMessage(e.getMessage());
return new ResponseEntity<ErrorMsg>(errorMsg,HttpStatus.OK);
}
@ExceptionHandler(CustomerNumberInvalid.class)
public ResponseEntity<ErrorMsg> CustomerNumberInvalidException(CustomerNumberInvalid e) {
ErrorMsg errorMsg=new ErrorMsg();
errorMsg.setMessage(e.getMessage());
return new ResponseEntity<ErrorMsg>(errorMsg,HttpStatus.OK);
}
@ExceptionHandler(CustomerEmailInvalid.class)
public ResponseEntity<ErrorMsg> CustomerEmailInvalidException(CustomerEmailInvalid e) {
ErrorMsg errorMsg=new ErrorMsg();
errorMsg.setMessage(e.getMessage());
return new ResponseEntity<ErrorMsg>(errorMsg,HttpStatus.OK);
}
@ExceptionHandler(CustomerPasswordInvalid.class)
public ResponseEntity<ErrorMsg> CustomerPasswordInvalidException(CustomerPasswordInvalid e) {
ErrorMsg errorMsg=new ErrorMsg();
errorMsg.setMessage(e.getMessage());
return new ResponseEntity<ErrorMsg>(errorMsg,HttpStatus.OK);
}
}