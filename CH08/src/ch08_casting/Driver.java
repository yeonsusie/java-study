package ch08_casting;

//�Ű������� ������ �� ����Ÿ�Ժ�ȯ ����
public class Driver {

	public void drive(Vehicle vehicle){
		if(vehicle instanceof Bus){ //�Ű������� ���� ��ü�� bus�� ������ ����Ÿ�Ժ�ȯ -> bus���� �޼ҵ� ����
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}
