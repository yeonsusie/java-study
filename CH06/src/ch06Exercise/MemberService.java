package ch06Exercise;

public class MemberService {
	public boolean login(String id, String password){
		if(id.equals("hong"))
			if(password.equals("12345"))
				return true;
			else return false;
		else return false;
	}
	
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다");
	}

}
