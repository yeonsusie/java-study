package ch09_annonymous_interface;

//�͸� ���� ��ü ����
public class Annonymous {
	
	//�ʵ�� ����
	RemoteControl field = new RemoteControl(){

		@Override
		public void turnOn() {
			System.out.println("field_turnon");
			
		}

		@Override
		public void turnOff() {
			System.out.println("field_turnoff");
			
		}
		
	};
	
	//�޼ҵ�� ����
	void method1(){
		RemoteControl local = new RemoteControl(){

			@Override
			public void turnOn() {
				System.out.println("local_turnon");
				
			}

			@Override
			public void turnOff() {
				System.out.println("local_turnoff");
				
			}
			
		};
		local.turnOn();
		local.turnOff();
	}
	
	void method2(RemoteControl rc){
		rc.turnOn();
		rc.turnOff();
	}

}
