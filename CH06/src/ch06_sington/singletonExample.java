package ch06_sington;

public class singletonExample {

	public static void main(String[] args) {
		//error���� �̱��� ��ü ȣ��
		//singleton obj1 = new singleton();
		
		//�ùٸ� �̱��� ��ü ȣ��
		singleton obj1 = singleton.getInstance();
		singleton obj2 = singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("���� ��ü ����");
		}
		
	}

}
