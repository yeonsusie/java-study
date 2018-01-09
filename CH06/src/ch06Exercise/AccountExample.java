package ch06Exercise;

//19번 예제
public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		
		account.setBalance(1000);
		System.out.println("현재잔고 :" + account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재잔고 :" + account.getBalance());

		account.setBalance(2000000);
		System.out.println("현재잔고 :" + account.getBalance());

		account.setBalance(300000);
		System.out.println("현재잔고 :" + account.getBalance());


	}

}
