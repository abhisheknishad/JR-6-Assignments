package exceptionhandling;

public class InvalidPersonLastNameException extends RuntimeException{
	InvalidPersonLastNameException(String msg){
		super(msg);
	}

}
