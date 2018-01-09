package ch06Exercise;

import java.util.Scanner;

public class BankApplication {
	//account ��ü �迭, ���� ���ذ����� �����ڸ� ����� �޸� �Ҵ�޾ƾ� ��
	//static���� ���� ���� : main���� �ٷ� ���� ����.
	private static Account[] accountArray = new Account[100]; 
	private static Scanner scanner = new Scanner(System.in);
	
	//accountArray �迭 ���� ī��Ʈ ��.
	static int i = 0;

	public static void main(String[] args) {
		boolean run = true;
		while(run){
			System.out.println("-------------------------------");
			System.out.println("1.���»��� / 2.���¸�� / 3.���� / 4.��� / 5.����");
			System.out.println("-------------------------------");
			System.out.print("����> ");
			
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
		
		System.out.println("���α׷� ����");
		
	}
	
	//���»��� �޼ҵ�
	private static void CreateAccount(){
		System.out.println("-----------");
		System.out.println("���»���");
		System.out.println("-----------");

		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		System.out.print("������: ");
		String owner = scanner.next();
		System.out.print("�ʱ��Աݾ�: ");
		int balance = scanner.nextInt();
		
		if(i<=100){
			accountArray[i] = new Account(ano, owner, balance);
			System.out.println("���: ���°� �����Ǿ����ϴ�");
			i++;
		}
		else
			System.out.println("���»��� �Ұ�");
	}
	
	//���¸�� �޼ҵ�
	private static void accountList(){
		System.out.println("-----------");
		System.out.println("���¸��");
		System.out.println("-----------");
		
		for(int j=0; j<i; j++){
			System.out.println(accountArray[j].getAno() + "   " + accountArray[j].getOwner() + "    "+ accountArray[j].getBalance());
		}
		
	}

	//���� �޼ҵ�
	private static void deposit(){
		System.out.println("-----------");
		System.out.println("����");
		System.out.println("-----------");
		
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		System.out.print("���ݾ�: ");
		int balance = scanner.nextInt();
		
		Account account = findAccount(ano);
		balance = account.getBalance() + balance;
		account.setBalance(balance);
		
		System.out.println("���: ������ �����Ǿ����ϴ�");
		
		
	}
	
	//��� �޼ҵ�
	private static void withdraw(){
		System.out.println("-----------");
		System.out.println("���");
		System.out.println("-----------");
		
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		System.out.print("��ݾ�: ");
		int balance = scanner.nextInt();
		
		Account account = findAccount(ano);
		balance = account.getBalance() - balance;
		account.setBalance(balance);
		
		System.out.println("���: ����� �����Ǿ����ϴ�");
		
	}
	
	//Account �迭���� ano�� ������ ��ü ã��
	private static Account findAccount(String ano){
	/*	for(int j=0; j<i; j++){
			if(accountArray[j].getAno().eSquals(ano)){
				return accountArray[j];			 
			}
		}
		*/		
		
		//���� for��
		for(Account acc : accountArray){
			if(acc.getAno().equals(ano)){
				return acc;
			}
		}
		return null; //�� �ڵ�� �� �־�� �ϴ°ɱ�
	}
	
}
