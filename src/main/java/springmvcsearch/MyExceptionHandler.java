package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {
	
	//this is for handling any exception that occur in the handler methods of this Controller
    //For handling any exception we use @ExceptionHandler(value=Exception.class)
		
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({NullPointerException.class,NumberFormatException.class})
	public String exceptionHandler()
	{
		return "null_page";
	}
	
	/*
	 * 
	In above handler method we used for configured for both Nullpointer and NumberFormat exceptions.
	If we want to configure for single exception we can write as follows 
	@ExceptionHandler(value=NullPointerException.class)
	*/
	
}
