package home;

public class Integer1 {

	public static void main(String[] args) {
		// 문자형을 숫자로 변환
//		System.out.println("10");
//		System.out.println("10" + "11");
//		System.out.println(10 + 11);
//		
		// 문자 "10" 숫자를 Integer.parseInt를 사용해 정수로 변환
		int value1 = Integer.parseInt("10");
		System.out.println(value1);
		
		int value2 = Integer.parseInt("11");
		System.out.println(value2);
		
		// ()소괄호로 묶어주면 연산, ()가 없으면 문자열 연결돼서 출력
		System.out.println("합계: " + (value1 + value2));
		System.out.println(value1 > value2);

		// 문자 "2.54"을 Double.parseDouble을 사용해 실수로 변환함
		double value3 = Double.parseDouble("2.65");
		double value4 = Double.parseDouble("4.2");
		System.out.println("합계: " + (value3 + value4));
		
	}

}
