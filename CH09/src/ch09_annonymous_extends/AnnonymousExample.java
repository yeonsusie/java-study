package ch09_annonymous_extends;

public class AnnonymousExample {

	public static void main(String[] args) {
		Annonymous anny = new Annonymous();
		
		//�͸� ��ü �ʵ� ���
		anny.field.wake();
		
		//�޼ҵ� �� �͸� ��ü ���
		anny.method1();
		
		//�Ű������� �͸� ��ü ���
		anny.method2(new Person(){
			void study(){
				System.out.println("study");
			}
			
			@Override
			void wake(){
				System.out.println("maegae_override_�Ͼ�ϴ�");
				study();
			}
		});
	}

}
