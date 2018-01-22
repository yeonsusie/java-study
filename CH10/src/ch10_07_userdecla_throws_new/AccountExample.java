package ch10_07_userdecla_throws_new;

//사용자 예외 및 예외 떠넘기기 실행 예제
public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		
		//예금하기_오류없음
		account.deposit(10000);
		System.out.println("예금액 :" + account.getBalane());
		
		//출금하기_예외처리필수
		try{
			account.withdraw(20000);
		}
		//사용자 예외 객체 넘겨 받음, 예외 처리
		catch(BalanceException e){
			//getMessage()로 account에서 넘어온 throw new 예외("메세지") 의 메세지 리턴받음
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			
			//예외 발생 코드 정보 상세하게 출력
			e.printStackTrace();
		}
	}
	

}
