package ch09_annonymous_button;

//button�� �������̽��� �͸� ���� ��ü ����
public class Window {
	//��ư �ΰ� 
	Button button1 = new Button();
	Button button2 = new Button();
	
	//�ʵ� �������� �������̽� ���� ��ü ����
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("button1");
		}
	};
	
	Window(){
		button1.setOnClickListener(listener);
		button2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("button2");
				
			}
		});
		
	}

}
