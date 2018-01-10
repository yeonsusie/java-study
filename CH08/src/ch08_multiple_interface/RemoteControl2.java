package ch08_multiple_interface;

//�������̽� ���� ����
public interface RemoteControl2 {
	
	//��� �ʵ�, ����� ���ÿ� �ʱⰪ �ʼ�
	//public static final�� �ڵ����� ����
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//�߻� �޼ҵ�, �޼ҵ� ���� ����
	//public abstract �� �ڵ����� ����
	public abstract void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//����Ʈ �޼ҵ�, ���� �κ� �ۼ�
	//public �ڵ� ����
	public default void setMute(boolean mute){
		if(mute){
			System.out.println("����ó��");
		}
		else {
			System.out.println("����ó�� ����");
		}
	}
	
	//���� �޼ҵ�, ���� �κ� �ۼ�, ��ü ���� ���� ����
	//public �ڵ� ����
	public static void changeBattery(){
		System.out.println("������ ��ȯ");
	}

}
