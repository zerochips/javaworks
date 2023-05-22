package var;

public class FloatDoubleType {

	public static void main(String[] args) {
		// 실수 자료형 - float(4byte), double(8바이트-표준)
		// 소숫점이하의 정밀도 차이
		// 더블이 표준이니까 float는 long을 사용할 때 'L'을 쓰는 것처럼 붙여줘야겠쬬
		// 소수 7자리 넘으면 float 오류 -> 이 때 double을 사용
		// double은 소수 16자리까지 출력됨
		float fNum = 1.23456789F;
		double dNum = 1.2345678901234567;
		
		System.out.println(fNum + " <- float 소수 7자리 넘으면 오류");
		System.out.println(dNum + " <- double 소수 16자리까지 출력됨");

	}

}
