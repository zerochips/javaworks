package singleton.car;

public class CarTest {

	public static void main(String[] args) {
		// 자동차 공장 객체 생성
		CarFactory company = CarFactory.getInstance();		
		
		Car mySonata = company.createCar();
		Car yourSonata = company.createCar();
		
		System.out.println("차량번호: "+ mySonata.getCarNum());
		System.out.println("차량번호: "+yourSonata.getCarNum());
		
	}

}

/* 자동차를 new 했잖아요
 * 음.. 자동차만 했다고 틀린건 아닙니다.
 * 현실과 같은 맥락으로 해보자 해서
 * 공장과 자동차 패턴으로 한 것 같아요!
 * 반드시 이렇게 하지 않아도 되는겁니다.
 * 이렇게 안해도 실행 됩니다.
 * 
 * company 자동차 공장이 하나 만들어졌죠
 */
 