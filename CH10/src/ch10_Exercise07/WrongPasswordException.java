package ch10_Exercise07;

//잘못된 패스워드 사용자 예외
public class WrongPasswordException extends Exception {
	public WrongPasswordException(){}
	public WrongPasswordException(String message){
		super(message);
	}

}
