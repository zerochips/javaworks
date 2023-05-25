package transport;

// 사람 클래스(참조 자료형)
public class Person {

	String name;
	int age;
	int money;	// 가진 돈
	
	// 외부에서 사용하려면public을 써야하는데
	// 지금은 같은 패키지에 있으니까 안써도 됩니다.
	// 이걸 default라고 합니다
	Person(String name, int money){  
		this.name = name;
		this.money = money;
	}
	
	// 요금을 내고 교통수단을 이용하는 메서드
	// Vehicle vehicle -> 상속과 다형성 이용
	public void take(Vehicle vehicle, int fee) {
		vehicle.carry(fee);
		this.money -= fee; 	// 가진돈에서 요금만큼 차감
	}
	
	// 정보 출력
	// 사람의 정보
	void showInfo() {
		System.out.printf("%s님의 남은 돈은 %,d원입니다.\n", 
				name, money);
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