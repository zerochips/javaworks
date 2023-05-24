package enums;

public class UsingDefineTest {

	public static void main(String[] args) {
		// 상수 사용하기
		int maxV = UsingDefine.MAX_NUM;
		double radius = UsingDefine.EARTH_RADIUS;
		
		// 지구의 반지름과 표면적
		System.out.println("지구반지름: " + radius + "km");
		System.out.println("지구의 표면적: " + (4 * Math.PI * radius * radius) + "km^2\n" );
		// 출력하는 방법 2가지 - 최대값 클래스로 불러와서 출력 / 최소값 바로 불러와서 출력하는 방법
		System.out.println("최대값: " + maxV);
		System.out.println("최소값: " + UsingDefine.MIN_NUM);
		System.out.println("원주율: " + UsingDefine.PI);
		System.out.println("원주율: " + Math.PI);	// 정밀한 작업일때 이렇게 사용
	}

}
