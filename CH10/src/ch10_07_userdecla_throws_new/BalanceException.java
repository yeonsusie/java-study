package ch10_07_userdecla_throws_new;

//����� ���� ���� ����
public class BalanceException extends Exception{
	//�Ϲ������� ������ �� �� ����
	public BalanceException() {}
	public BalanceException(String message){
		super(message); //�������� ��� �뵵
	}

}
