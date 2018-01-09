package ch07_extends;

public class Car {
	//필드
	Tire frontLeft = new Tire("앞왼",6);
	Tire frontRight = new Tire("앞오",2);
	Tire backLeft = new Tire("뒤왼",3);
	Tire backRight = new Tire("뒤오",4);
	
	public int run(){
		System.out.println("회전수 추가!");
		
		//roll()로 회전 후 펑크 여부 확인
		//return 1,2,3,4 로 어느 타이어에서 펑크났는지 여부 확인
		if(frontLeft.roll() == false) {
			stop();
			return 1;
		}
		if(frontRight.roll() == false) {
			stop();
			return 2;
		}
		if(backLeft.roll() == false) {
			stop();
			return 3;
		}
		if(backRight.roll() == false) {
			stop();
			return 4;
		}
		return 0;
	}
	
	public void stop(){
		System.out.println("펑크남");
		return;
	}

}
