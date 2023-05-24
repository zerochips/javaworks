package singleton.car;

public class CarFactory {
	//싱글톤 패턴
	// new 안하잖아요~ static
	// 객체 필드(변수)
	private static CarFactory instance;
	
	// 생성자
	private CarFactory() {}
	
	// getInstance() 메서드
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	
	// 자동차 생산
	public Car createCar() {
		Car car = new Car();
		return car;
	}

	
}
/* 자동차를 new 했잖아요
 * 음.. 자동차만 했다고 틀린건 아닙니다.
 * 현실과 같은 맥락으로 해보자 해서
 * 공장과 자동차 패턴으로 한 것 같아요!
 * 반드시 이렇게 하지 않아도 되는겁니다.
 * 이렇게 안해도 실행 됩니다.
 */
 