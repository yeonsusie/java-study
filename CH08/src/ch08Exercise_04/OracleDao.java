package ch08Exercise_04;

public class OracleDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("oracle �˻�");
	}

	@Override
	public void insert() {
		System.out.println("oracle ����");
		
	}

	@Override
	public void update() {
		System.out.println("oracle ����");
		
	}

	@Override
	public void delete() {
		System.out.println("oracle ����");
		
	}

}
