package ch07_extends;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		//car��ü�� run�޼ҵ� 5�� �ݺ�����, ��ũ ��� Ȯ��
		for(int i = 1; i<=5 ; i++){
			int problemLocation = car.run();
			
			switch(problemLocation){
			case 1:
				System.out.println("�տ��� hankookŸ�̾� ��ü");
				car.frontLeft = new HankookTire("�տ�",15);
				break;
			case 2:
				System.out.println("�տ����� hankookŸ�̾� ��ü");
				car.frontRight = new HankookTire("�տ�",15);
				break;
			case 3:
				System.out.println("�޿��� KumhoŸ�̾� ��ü");
				car.backLeft = new KumhoTire("�޿�",15);
				break;
			case 4:
				System.out.println("�տ��� kumhoŸ�̾� ��ü");
				car.backRight = new KumhoTire("�޿�",15);
				break;
		}
		
		System.out.println("---------------------");	
		}
	}

}
