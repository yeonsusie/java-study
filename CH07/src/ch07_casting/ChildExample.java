package ch07_casting;

public class ChildExample {

	public static void main(String[] args) {
		Parents parents = new Child();
		
		parents.field1 = "data1";
		parents.method1();
		parents.method2();
		
		//�θ�Ŭ������ �ʵ�,�޼ҵ�(�����ǾȵǾ��������)�� ���� ����
		//parents.field2 = "data2";
		//parents.method3();
		
		Child child = (Child) parents;
		
		child.field2 = "data2";
		child.method3();
	}

}
