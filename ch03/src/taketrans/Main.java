package taketrans;

public class Main {

	public static void main(String[] args) {
		// [사람] 객체 생성
		Person inbi = new Person("박인비", 10000);
		Person nara = new Person("이나라", 5000);
		
		// [버스] 객체 생성
		Bus bus100 = new Bus(100);		
		
		// 사람이 버스를 [탄다]
		inbi.takeBus(bus100);
		nara.takeBus(bus100);			
		
		// [지하철] 객체 생성
		Subway subway9 = new Subway("9호선");			
		
		// 사람이 지하철을 [탄다]
		inbi.takeSubwya(subway9);
		nara.takeSubwya(subway9);
		
		// 출력
		inbi.showInfo();
		nara.showInfo();
		bus100.showInfo();
		
		subway9.showInfo();		

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
