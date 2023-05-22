package taketrans;

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
	
	//************** [버스]를 타는 기능을 하는 메서드 **************
	// 매개변수에는 - 자료형과, 변수이름이 들어가죠
	void takeBus(Bus bus) {
		bus.take(1300);		// 1300원 매개로 전달
		this.money -= 1300;	// 1300원 차감
	}
	
	//************** [지하철]을 타다 **************
	void takeSubwya(Subway subway) {
		subway.take(1250);		// 1300원 매개로 전달
		this.money -= 1250;		// 1300원 차감
	}
	
	// 정보 출력
	// 사람의 정보
	void showInfo() {
		System.out.printf("%s님의 남은 돈은 %,d원입니다.", 
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