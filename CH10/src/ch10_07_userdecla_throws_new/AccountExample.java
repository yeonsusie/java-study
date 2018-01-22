package ch10_07_userdecla_throws_new;

//����� ���� �� ���� ���ѱ�� ���� ����
public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		
		//�����ϱ�_��������
		account.deposit(10000);
		System.out.println("���ݾ� :" + account.getBalane());
		
		//����ϱ�_����ó���ʼ�
		try{
			account.withdraw(20000);
		}
		//����� ���� ��ü �Ѱ� ����, ���� ó��
		catch(BalanceException e){
			//getMessage()�� account���� �Ѿ�� throw new ����("�޼���") �� �޼��� ���Ϲ���
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			
			//���� �߻� �ڵ� ���� ���ϰ� ���
			e.printStackTrace();
		}
	}
	

}
