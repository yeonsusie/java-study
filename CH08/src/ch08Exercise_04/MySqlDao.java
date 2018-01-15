package ch08Exercise_04;

public class MySqlDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("myoracle 검색");
	}

	@Override
	public void insert() {
		System.out.println("myoracle 삽입");
		
	}

	@Override
	public void update() {
		System.out.println("myoracle 수정");
		
	}

	@Override
	public void delete() {
		System.out.println("myoracle 삭제");
		
	}

}
