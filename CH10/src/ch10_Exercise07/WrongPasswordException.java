package ch10_Exercise07;

//�߸��� �н����� ����� ����
public class WrongPasswordException extends Exception {
	public WrongPasswordException(){}
	public WrongPasswordException(String message){
		super(message);
	}

}
