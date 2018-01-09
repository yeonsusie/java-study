package ch07_extends;

public class Tire {
	//필드
	public int maxRotation; //최대 회전수
	public int accumulateRotation; //누적 회전수
	public String location; //타이어 위치 알려줌
	
	public Tire(String location, int maxRotation){
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll(){
		++accumulateRotation;
		if(accumulateRotation < maxRotation){
			System.out.println(location+"남은 회전수: "+ (maxRotation-accumulateRotation));
			return true;
		}
		else {
			System.out.println(location + " 펑크 ");
			return false;
		}
	}

}
