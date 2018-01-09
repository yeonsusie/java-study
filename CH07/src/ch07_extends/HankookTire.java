package ch07_extends;

public class HankookTire extends Tire{
	
	public HankookTire(String location, int maxRotation){
		super(location,maxRotation); //tire 부모클래스 생성자에 매개변수가 있기 때문
	}
	
	@Override
	public boolean roll(){
		++accumulateRotation;
		if(accumulateRotation < maxRotation){
			System.out.println(location+" Hankook타이어 수명: "+ (maxRotation-accumulateRotation));
			return true;
		}
		else {
			System.out.println(location + " Hankook타이어 펑크 ");
			return false;
		}
	}
		
	

}
