package ch09_interface;

public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button();
		
		//callListener ���� ��ü ����
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		//messageListener ���� ��ü ����
		btn.setOnClickListener(new MessageListener());
		btn.touch();
	}

}
