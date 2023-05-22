package hiding;

public class AccountTest {

	public static void main(String[] args) {
		// 계좌 객체 생성
		Account a1 = new Account("1000-1234", "이몽룡", 50000);
		Account a2 = new Account("3000-1234", "성춘향", 100000);
		
		System.out.println("계좌번호: " + a1.getAno());
		System.out.println("계좌주: " + a1.getOwner());
		System.out.printf("잔액: %,d원", a1.getBalance());
		System.out.println();
		//a1.getAno("2000-1234");	여기 오류나는거 확인해야함.	
		//System.out.println(a1.getAno());
		
		System.out.println();
		System.out.println("계좌번호: " + a2.getAno());
		System.out.println("계좌주: " + a2.getOwner());
		System.out.printf("잔액: %,d원", a2.getBalance());

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