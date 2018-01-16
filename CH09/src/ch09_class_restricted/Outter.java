package ch09_class_restricted;

//�ٱ� Ŭ������ �ʵ�/�޼ҵ� ȣ�� ����
public class Outter {
	String field = "outter-field";
	String out_field = "outter-field";
	void method(){
		System.out.println("outter-method");
	}
	void out_method(){
		System.out.println("outter-method");
	}
	
	class Nested{
		String field = "nested-field";
		String nested_field = "nested-field";
		void method(){
			System.out.println("nested-method");
		}
		void nest_method(){
			System.out.println("nested-method");
		}
		
		//thisŰ����� �ٱ� Ŭ���� ����
		void print_this(){
			//outterŬ������ �ʵ�/�޼ҵ� ȣ��
			System.out.println(Outter.this.field); 
			Outter.this.method();
			//nestedŬ������ �ʵ�/�޼ҵ� ȣ��
			System.out.println(this.field);
			this.method();
		}
		
		//�̸��� �ٸ� ��쿣 this���� �ٷ� ȣ�� ����
		void print(){
			System.out.println(out_field);
			out_method();
			System.out.println(nested_field);
			nest_method();
		}
		
		
	}

}
