package ch10_07_userdecla_throws_new;

//사용자 정의 예외 선언
public class BalanceException extends Exception{
	//일반적으로 생성자 두 개 만듬
	public BalanceException() {}
	public BalanceException(String message){
		super(message); //오류내역 출력 용도
	}

}
