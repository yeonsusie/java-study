package ch07_extends;

public class Tire {
	//�ʵ�
	public int maxRotation; //�ִ� ȸ����
	public int accumulateRotation; //���� ȸ����
	public String location; //Ÿ�̾� ��ġ �˷���
	
	public Tire(String location, int maxRotation){
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll(){
		++accumulateRotation;
		if(accumulateRotation < maxRotation){
			System.out.println(location+"���� ȸ����: "+ (maxRotation-accumulateRotation));
			return true;
		}
		else {
			System.out.println(location + " ��ũ ");
			return false;
		}
	}

}
