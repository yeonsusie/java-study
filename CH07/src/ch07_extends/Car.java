package ch07_extends;

public class Car {
	//�ʵ�
	Tire frontLeft = new Tire("�տ�",6);
	Tire frontRight = new Tire("�տ�",2);
	Tire backLeft = new Tire("�ڿ�",3);
	Tire backRight = new Tire("�ڿ�",4);
	
	public int run(){
		System.out.println("ȸ���� �߰�!");
		
		//roll()�� ȸ�� �� ��ũ ���� Ȯ��
		//return 1,2,3,4 �� ��� Ÿ�̾�� ��ũ������ ���� Ȯ��
		if(frontLeft.roll() == false) {
			stop();
			return 1;
		}
		if(frontRight.roll() == false) {
			stop();
			return 2;
		}
		if(backLeft.roll() == false) {
			stop();
			return 3;
		}
		if(backRight.roll() == false) {
			stop();
			return 4;
		}
		return 0;
	}
	
	public void stop(){
		System.out.println("��ũ��");
		return;
	}

}
