package ch08_mutiple_extends;

public class ExtendsExample {
	public static void main(String args[]){
		Extends extend = new Extends();
		
		//Ÿ���� interfaceA�̹Ƿ� methodA���� ���� ����
		InterfaceA a = extend;
		a.methodA();
		System.out.println();
		
		//Ÿ���� interfaceB�̹Ƿ� methodB���� ���� ����
		InterfaceB b = extend;
		b.methodB();
		System.out.println();
		
		//Ÿ���� interfaceC�̹Ƿ� ��ӹ��� methodA,methodB,methodC ��� ���� ����
		InterfaceC c = extend;
		c.methodA();
		c.methodB();
		c.methodC();
		
	}

}
