package ch09_class_sunun;

import ch09_class_sunun.A.C;

public class Main {

	public static void main(String[] args) {
		//�ٱ� Ŭ���� ��ü ����
		A a = new A();
		
		
		//�ν��Ͻ� ��� Ŭ���� ��ü ����
		A.B b = a.new B();
		b.field1=1;
		b.method1();
		
		//���� ��� Ŭ���� ��ü ����
		A.C c = new A.C(); //���� ��� Ŭ���� ���� �ν��Ͻ� �ʵ�/�޼ҵ�� ��ü�� �����Ͽ� ����
		c.field1=2;
		c.method1();
		A.C.field2=2;
		A.C.method2();
		
		//���� Ŭ���� ���� -> �޼ҵ� ȣ��
		a.method();
	}

}
