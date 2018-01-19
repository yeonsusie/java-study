package ch09_annonymous_interface;

public class AnnonymousExample {

	public static void main(String[] args) {
		Annonymous anny = new Annonymous();
		
		//�͸� ��ü �ʵ�
		anny.field.turnOn();
		anny.field.turnOff();
		
		//�޼ҵ� �� �͸� ��ü
		anny.method1();
		
		//�Ű����� �͸� ��ü
		anny.method2(new RemoteControl(){

			@Override
			public void turnOn() {
				System.out.println("maegae_turnon");
			}

			@Override
			public void turnOff() {
				System.out.println("maegae_turnon");
			}
			
		});
	}

}
