package ch06_sington;

public class singleton {
	//��ü����, �ϳ� �������� �� ��ü�� ��� ȣ���Ͽ� �����
	private static singleton singleton = new singleton();

	private singleton(){} //�����ڸ� private��
	
	//getInstance �޼ҵ带 �̿��Ͽ� �������� ��ü�� ��� ȣ��
	static singleton getInstance(){
		return singleton;
	}
}
