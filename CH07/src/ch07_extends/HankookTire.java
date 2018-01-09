package ch07_extends;

public class HankookTire extends Tire{
	
	public HankookTire(String location, int maxRotation){
		super(location,maxRotation); //tire �θ�Ŭ���� �����ڿ� �Ű������� �ֱ� ����
	}
	
	@Override
	public boolean roll(){
		++accumulateRotation;
		if(accumulateRotation < maxRotation){
			System.out.println(location+" HankookŸ�̾� ����: "+ (maxRotation-accumulateRotation));
			return true;
		}
		else {
			System.out.println(location + " HankookŸ�̾� ��ũ ");
			return false;
		}
	}
		
	

}
