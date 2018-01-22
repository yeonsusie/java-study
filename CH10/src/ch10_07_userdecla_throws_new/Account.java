package ch10_07_userdecla_throws_new;

//사용자 정의 예외 실행내용 & 발생
public class Account {
	private long balance;
	
	public Account() {}
	
	public long getBalane(){
		return balance;
	}
	
	//예금 메소드
	public void deposit(int money){
		balance = balance + money;
	}
	
	//출금 메소드_예외 처리 할 부분
	//인출할 금액이 잔액보다 많은 경우 에러발생_ 정의한 balanceException 예외 발생시켜 withdraw 호출한 메소드로 보냄
	public void withdraw(int money) throws BalanceException {
		if(balance < money){
			throw new BalanceException("잔고부족");
		}
		balance = balance - money;
	}

}
