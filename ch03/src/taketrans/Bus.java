package taketrans;

public class Bus {
	
	int busNumber;	// 버스 번호
	int passenger;	// 승객수
	int money;		// 수입
	
	// 생성자
	Bus(int busNumber){
		this.busNumber = busNumber;
	}
	
	// 태우는 기능을 하는 메서드
	// this는 생성자뿐만 아니라 메서드에서도 사용합니다.
	void take(int money) {
		this.money += money;
		passenger++;	// passenger += 1
		
	}
	
	// 버스의 정보
	void showInfo() {
		System.out.printf("%d번 버스의 수입은 %d원이고, " 
				+ "승객수는 %d명 입니다.\n", 
				busNumber, money, passenger);
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
