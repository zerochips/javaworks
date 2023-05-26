package abstractex.template;

public class CarMain {

	public static void main(String[] args) {
		//AICar의 객체 생성 - 부모 타입으로 형변환
		Car myCar = new AICar();
		
		myCar.run();

	}

}
/*
인터페이스 - tv 리모컨 -> lg, 삼성
어떤 기준을 주면 해당되는 기능을 구현하는것을 말함
인터페이스 - 클래스의 한 종류이지만
interface 인터페이스이름{ 모든 메서드 - 추상메서드(선언만 있고 구현 없음): abstract 생략 }
*/
 