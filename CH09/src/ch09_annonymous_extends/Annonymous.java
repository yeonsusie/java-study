package ch09_annonymous_extends;

//�͸� �ڽ� ��ü ���� - �ʵ�/�޼ҵ�/�Ű�����
public class Annonymous {
	
	//�ʵ�� ����
	Person field = new Person() {
		void work(){
			System.out.println("work");
		}
		
		@Override
		void wake(){
			System.out.println("field_override_�Ͼ�ϴ�");
			work();
		}
	};
	
	//�޼ҵ�� ����
	void method1(){
		Person local = new Person(){
			void walk(){
				System.out.println("walk");
			}
			@Override
			void wake(){
				System.out.println("local_override_�Ͼ�ϴ�");
				walk();
			}
			
		};
		local.wake();
	}
	
	//�Ű������� ����
	void method2(Person person){
		person.wake();
	}

}
