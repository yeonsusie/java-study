package pr1;

//nts �ڹ� ���� 1��
public class ques_first {
	public static void main(String[] args){
	for(int i = 0;i<3;i++) {
		for(int j=0;j<2;j++){
			if(i==j){
				continue;
			}
			System.out.println(i+"-"+j);
		}
	}
	}
}
