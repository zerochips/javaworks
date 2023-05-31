package interfaceex.tire;

public class Car {
	//필드드는 필든데 객체라고할 수 있습니다. - 부모형으로 형 변환
	Tire frontLeftTire = new HanTire();
	Tire frontRightTire = new HanTire();
	Tire backRightTire = new KumTire();
	Tire backLeftTire = new KumTire();
	
	//메서드
	public void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backRightTire.roll();
		backLeftTire.roll();
	}
			
}
