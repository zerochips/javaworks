package inheritance.airplane;

public class AirPlaneMain {

	public static void main(String[] args) {
		// SuperSonicAirPlane 객체 생성
		SuperSonicAirPlane sa = new SuperSonicAirPlane();
		
		sa.takeoff();
		sa.fly();
		
		// 초음속 비행
		sa.flyMode = SuperSonicAirPlane.SUPERSONIC;
		sa.fly();
		
		// 다시 모드를 바꿔
		sa.flyMode = SuperSonicAirPlane.NORMSL;
		sa.fly();
		
		sa.land();
		
	}

}
