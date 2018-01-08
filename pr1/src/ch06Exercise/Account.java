package ch06Exercise;

//상수(static final) , getter,setter 사용
//19,20번 통합 
public class Account {
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	private String ano;
	private String owner;
	private int balance;
	
	public Account(){}
	public Account(String ano, String owner, int balance){
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
}
	
	public String getAno(){
		return ano;
	}
	
	public void setAno(String ano){
		this.ano = ano;
	}
	
	public String getOwner(){
		return owner;
	}
	
	public void setOwner(String owner){
		this.owner = owner;
	}
	
	public int getBalance(){
		return balance;
	}
	
	public void setBalance(int balance){
		if(MIN_BALANCE<=balance && balance <=MAX_BALANCE){
			this.balance = balance;
		} else {
			return;
		}
	}

}
