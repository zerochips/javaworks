package taketrans;

// 지하철 클래스 만들기
public class Subway {
	String lineNumber;
	int passengerCount;
	int money;
	
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;		
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.printf("지하철 %s의 수입은 %,d원이고, 승객수는 %d명입니다.\n",
				lineNumber, money, passengerCount);
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
 