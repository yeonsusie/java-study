package ch09_class_sunun;

//��øŬ���� ����
public class A { //�ٱ�Ŭ����
	A(){
		System.out.println("A��ü�� ������");
	}
	
	/*�ν��Ͻ� ��� Ŭ����*/
	class B {
		B(){
			System.out.println("B��ü�� ������");
		}
		int field1;
		//static int field2
		void method1(){System.out.println("B�� �޼ҵ�"); }
		//static void method2(){}
	}
	
	/*���� ��� Ŭ����*/
	static class C {
		C(){
			System.out.println("C��ü�� ������");
		}
		int field1;
		static int field2;
		void method1(){System.out.println("C�� �޼ҵ�"); }
		static void method2(){System.out.println("C�� ���� �޼ҵ�");}
	}
	
	void method(){
		/*����Ŭ����*/
		class D{
			D(){
				System.out.println("D��ü�� ������");
			}
			int field1;
			//static int field2;
			void method1(){System.out.println("D�� �޼ҵ�"); }
			//static void method2(){}
		}
		
		//�ش� �޼ҵ� ������ �ٷ� ����
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
	
	

}
