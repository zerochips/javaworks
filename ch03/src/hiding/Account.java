package hiding;

public class Account {
	// 멤버변수, 생성자, 메서드
	private String ano;		// 계좌 번호
	private String owner;	// 계좌주
	private int balance;	// 잔고
	
	// 생성자
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;				
	}
	
	// get() 메서드 : get + 멤버변수이름() - 
	public String getAno() {
		return ano;
	}
	
	// 수정, 변경, 설정할 때
	// set() 메서드 : set + 멤버변수이름()
	public void setAno(String ano) {
		this.ano = ano;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}

}
/*
 * public void take() - 외부에서 어디서든 접근 가능
 * void take() - 같은 패키지 내부에서 사용가능(default)
 * private void take() - 특정 클래스 내부에서만 사용가능 
 * private int money()
 * 		setMoney(int money){}
 * 		getMoney(){return money}
 */