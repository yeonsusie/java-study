package ch08Exercise_05;

public class ActionExample {

	public static void main(String[] args) {
		Action action = new Action(){

			@Override
			public void work() {
				System.out.println("복사를 합시다");
			}
			
		};
		
		action.work();
	}

}
