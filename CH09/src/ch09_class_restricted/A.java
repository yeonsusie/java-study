package ch09_class_restricted;

//�ν��Ͻ� ��� Ŭ����, ���� ��� Ŭ����, ���� Ŭ���������� ���� ����
public class A {
	
	// 1)�ٱ� Ŭ�������� Ŭ���� ����� ��ü ����
	
	/*�ν��Ͻ� �ʵ�� �޼ҵ�� ����*/
	B ins_b = new B();
	C ins_c = new C();
	
	void in_method(){
		B ins_b = new B();
		C ins_c = new C();
	}
	
	/*���� �ʵ�� �޼ҵ�� ����*/
	//�ν��Ͻ� ��� Ŭ������ B��ü ���� ����
	static C sta_c = new C();
	
	static void st_method(){
		C sta_c = new C();
	}
	
	
	// 2)��� Ŭ���� ���� �ٱ� Ŭ������ �ʵ�/�޼ҵ� ����
	int ins_field;
	void ins_method(){}
	
	static int sta_field;
	static void sta_method(){}
	
	/*�ν��Ͻ� ��� Ŭ����*/
	//��� ���� ����
	class B{
		void method(){
			ins_field = 1;
			ins_method();
			
			sta_field = 2;
			sta_method();
		}
	}
	
	/*���� ��� Ŭ����*/
	//���� �ʵ�� �޼ҵ忡�� ���� ����
	static class C{
		void method(){
			sta_field = 3;
			sta_method();
		}
		
	}
	
	
	// 3) ���� Ŭ���������� �������
	String a = "local";
	void a(){System.out.println("locallll");}
	
	void outMethod(int arg){
		int localVar = 1;
		//arg = 10;, localVar = 100; ���� ���� ����. final Ű���尡 �ڵ����� �ٱ� ����
		
		class Inner{
			//���ú����� �Ű����� ����ϱ�
			void method(){
				int result = arg + localVar;
				System.out.println(result);
			}
			
			//���� Ŭ���������� �ٱ� Ŭ������ �ʵ�� �޼ҵ� �����Ӱ� ��� ����
			void use(){
				System.out.println(a);
				a();
			}
		}
	}

}
