package ch10_Exercise07;

//id존재하지 않을 때 사용자 예외
public class NotExistIDException extends Exception{
	public NotExistIDException(){}
	public NotExistIDException(String message){
		super(message);
	}

}
