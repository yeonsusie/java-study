package ch10_07_userdecla_throws_new;

//����� ���� ���� ���೻�� & �߻�
public class Account {
	private long balance;
	
	public Account() {}
	
	public long getBalane(){
		return balance;
	}
	
	//���� �޼ҵ�
	public void deposit(int money){
		balance = balance + money;
	}
	
	//��� �޼ҵ�_���� ó�� �� �κ�
	//������ �ݾ��� �ܾ׺��� ���� ��� �����߻�_ ������ balanceException ���� �߻����� withdraw ȣ���� �޼ҵ�� ����
	public void withdraw(int money) throws BalanceException {
		if(balance < money){
			throw new BalanceException("�ܰ����");
		}
		balance = balance - money;
	}

}
