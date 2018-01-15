package ch08Exercise_04;

public class OracleDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("oracle 검색");
	}

	@Override
	public void insert() {
		System.out.println("oracle 삽입");
		
	}

	@Override
	public void update() {
		System.out.println("oracle 수정");
		
	}

	@Override
	public void delete() {
		System.out.println("oracle 삭제");
		
	}

}
