package ch08_interface;

//���� ��ü ���� �� �������̽� ��� ����
public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc; //�������̽� ���� ����
		rc = new Television(); //�������̽� ������ ���� ��ü ����
		
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		//rc.turn(); �������̽��� ���ǵ� �޼ҵ忡�� ���� ����
		
		
		//�͸� ���� ��ü
		//�������̽� ���� ����� ���ÿ� ���� Ŭ���� ����(�޼ҵ� ������)
		RemoteControl rc1 = new RemoteControl(){
			private int volume;

			@Override
			public void turnOn() {
				System.out.println("�͸� ��ü�� ŵ�ϴ�");
			}

			@Override
			public void turnOff() {
				System.out.println("�͸� ��ü�� ���ϴ�");
			}

			@Override
			public void setVolume(int volume) {
				this.volume = volume;
				System.out.println("�͸�ü���� : "+volume);
			}
			
		}; //Ŭ���� �����̱� ������ } �� ; �� ���̱�
		
		rc1.turnOn();
		rc1.turnOff();
	}

}
