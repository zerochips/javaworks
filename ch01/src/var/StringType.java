package var;

public class StringType {

	public static void main(String[] args) {
		// 문자열 자료형
		// 기본 자료형 - int, char, double
		char ch = 'k';
		
		// String 을 사용하면 "" 쌍따옴표 사용
		// String 은 클래스 객체자료형이라고 해요
		// 참조 자료형 - String, Integer
		String str = "k";

		String name = "ja" + "va";
		//'+'는 연결 연산자
		// 문자열 jana11.0으로 출력됨
		// 숫자와 문자를 연결할 수 있음
		String str2 = name + 11.0;
		
		System.out.println(ch);
		System.out.println(str);
		System.out.println(name);
		System.out.println(str2);
	}

}
