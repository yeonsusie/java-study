package ch07_extends;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		//car객체의 run메소드 5번 반복실행, 펑크 출력 확인
		for(int i = 1; i<=5 ; i++){
			int problemLocation = car.run();
			
			switch(problemLocation){
			case 1:
				System.out.println("앞왼쪽 hankook타이어 교체");
				car.frontLeft = new HankookTire("앞왼",15);
				break;
			case 2:
				System.out.println("앞오른쪽 hankook타이어 교체");
				car.frontRight = new HankookTire("앞오",15);
				break;
			case 3:
				System.out.println("뒷왼쪽 Kumho타이어 교체");
				car.backLeft = new KumhoTire("뒷왼",15);
				break;
			case 4:
				System.out.println("앞왼쪽 kumho타이어 교체");
				car.backRight = new KumhoTire("뒷오",15);
				break;
		}
		
		System.out.println("---------------------");	
		}
	}

}
