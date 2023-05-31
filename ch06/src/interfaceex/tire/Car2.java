package interfaceex.tire;

public class Car2 {
	
	// 필드 - 객체 배열 // 배열로 생성하였습니다.
	Tire[] tires = {
		new HanTire(), 	// 0번 - 이름이 없죠 - 익명
		new HanTire(),
		new KumTire(),
		new KumTire()
	};
	
	// 메서드
	public void run() {
		for(int i =0; i<tires.length; i++) {
			tires[i].roll();
		}
	}
	
	
	// 향상 for 문
	/*for(Tire tire : tires) {
		tire.roll();
	}*/	
}

