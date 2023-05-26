package abstractex.template;
//추상으로 갈게요 abstract
public abstract class Car {
	
	public abstract void drive();
	
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	// 템플릿 메서드 정의
	// final이 있으므로 상속 받은 클래스에서 재정의 할 수 없음.
	public final void run() {
		// 여기서 정의하는건 괜찮음
		startCar();
		drive();
		stop();
		turnOff();
	}
	
}
