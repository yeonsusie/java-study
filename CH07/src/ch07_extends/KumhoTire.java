package ch07_extends;

public class KumhoTire extends Tire{
	
	public KumhoTire(String location, int maxRotation){
		super(location,maxRotation); //tire �θ�Ŭ���� �����ڿ� �Ű������� �ֱ� ����
	}
	
	@Override
	public boolean roll(){
		++accumulateRotation;
		if(accumulateRotation < maxRotation){
			System.out.println(location+" KumhoŸ�̾� ����: "+ (maxRotation-accumulateRotation));
			return true;
		}
		else {
			System.out.println(location + " KumhoŸ�̾� ��ũ ");
			return false;
		}
	}
		
	


}
