package enums;

public class UsingDefineTest {

	public static void main(String[] args) {
		// 상수 사용하기
		int maxV = UsingDefine.MAX_NUM;
		
		// 출력하는 방법 2가지 - 최대값 클래스로 불러와서 출력 / 최소값 바로 불러와서 출력하는 방법
		System.out.println("최대값: " + maxV);
		System.out.println("최소값: " + UsingDefine.MIN_NUM);
	}

}
