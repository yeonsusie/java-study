package ch08_casting;

public class Example {

	public static void main(String[] args) {
		//�������̽� �Ű����� ������
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
		
		System.out.println("");
		
		//����Ÿ�Ժ�ȯ
		Vehicle vehicle = new Bus();
		vehicle.run();
		
		Bus buss = (Bus) vehicle;
		buss.checkFare();
	}

}
