package ch08Exercise_04;

public class MySqlDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("myoracle �˻�");
	}

	@Override
	public void insert() {
		System.out.println("myoracle ����");
		
	}

	@Override
	public void update() {
		System.out.println("myoracle ����");
		
	}

	@Override
	public void delete() {
		System.out.println("myoracle ����");
		
	}

}
