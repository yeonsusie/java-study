package ch07_abstract;

public class PhoneExample {

	public static void main(String[] args) {
		//Phone phone = new Phone(); �ܵ������� ��ü ���� �Ұ�
		
		//�ڽ�Ŭ������ smartphone���� �߻�Ŭ���� �޼ҵ忡 ����
		SmartPhone smartphone = new SmartPhone("ȫ�浿");
		
		smartphone.turnOn();
		smartphone.turnOff();
		smartphone.internetOn();
	}

}
