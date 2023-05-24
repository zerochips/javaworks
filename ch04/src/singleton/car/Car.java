package singleton.car;

public class Car {
	private static int serialNum = 10000;
	private int carNum;
	
	public Car() {
		serialNum++;
		carNum = serialNum;
	}
	
	// 위에 확인하니까 private 죠
	// 접근하려면 getCarNum()을 사용해서 가져와서 사용하면 됩니다.
	// 그럼 메서드를 사용합니다.
	public int getCarNum() {
		return carNum;
	}
}

/* 자동차를 new 했잖아요
 * 음.. 자동차만 했다고 틀린건 아닙니다.
 * 현실과 같은 맥락으로 해보자 해서
 * 공장과 자동차 패턴으로 한 것 같아요!
 * 반드시 이렇게 하지 않아도 되는겁니다.
 * 이렇게 안해도 실행 됩니다.
 */
 