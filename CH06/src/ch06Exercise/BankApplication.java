package ch06Exercise;

import java.util.Scanner;

public class BankApplication {
	//account 객체 배열, 선언만 해준것으로 생성자를 사용해 메모리 할당받아야 함
	//static으로 해준 이유 : main에서 바로 쓰기 위함.
	private static Account[] accountArray = new Account[100]; 
	private static Scanner scanner = new Scanner(System.in);
	
	//accountArray 배열 순서 카운트 용.
	static int i = 0;

	public static void main(String[] args) {
		boolean run = true;
		while(run){
			System.out.println("-------------------------------");
			System.out.println("1.계좌생성 / 2.계좌목록 / 3.예금 / 4.출금 / 5.종료");
			System.out.println("-------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1){
				CreateAccount();
			} 
			else if(selectNo == 2){
				accountList();
			}
			else if(selectNo == 3){
				deposit();
			}
			else if(selectNo == 4){
				withdraw();
			}
			else if(selectNo == 5){
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
		
	}
	
	//계좌생성 메소드
	private static void CreateAccount(){
		System.out.println("-----------");
		System.out.println("계좌생성");
		System.out.println("-----------");

		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("계좌주: ");
		String owner = scanner.next();
		System.out.print("초기입금액: ");
		int balance = scanner.nextInt();
		
		if(i<=100){
			accountArray[i] = new Account(ano, owner, balance);
			System.out.println("결과: 계좌가 생성되었습니다");
			i++;
		}
		else
			System.out.println("계좌생성 불가");
	}
	
	//계좌목록 메소드
	private static void accountList(){
		System.out.println("-----------");
		System.out.println("계좌목록");
		System.out.println("-----------");
		
		for(int j=0; j<i; j++){
			System.out.println(accountArray[j].getAno() + "   " + accountArray[j].getOwner() + "    "+ accountArray[j].getBalance());
		}
		
	}

	//예금 메소드
	private static void deposit(){
		System.out.println("-----------");
		System.out.println("예금");
		System.out.println("-----------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("예금액: ");
		int balance = scanner.nextInt();
		
		Account account = findAccount(ano);
		balance = account.getBalance() + balance;
		account.setBalance(balance);
		
		System.out.println("결과: 예금이 성공되었습니다");
		
		
	}
	
	//출금 메소드
	private static void withdraw(){
		System.out.println("-----------");
		System.out.println("출금");
		System.out.println("-----------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("출금액: ");
		int balance = scanner.nextInt();
		
		Account account = findAccount(ano);
		balance = account.getBalance() - balance;
		account.setBalance(balance);
		
		System.out.println("결과: 출금이 성공되었습니다");
		
	}
	
	//Account 배열에서 ano와 동일한 객체 찾기
	private static Account findAccount(String ano){
	/*	for(int j=0; j<i; j++){
			if(accountArray[j].getAno().eSquals(ano)){
				return accountArray[j];			 
			}
		}
		*/		
		
		//향상된 for문
		for(Account acc : accountArray){
			if(acc.getAno().equals(ano)){
				return acc;
			}
		}
		return null; //이 코드는 왜 넣어야 하는걸까
	}
	
}
