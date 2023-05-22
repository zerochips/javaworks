package var;

public class Variable {
	public static void main(String[] args) {
		// 변수 선언과 사용
		// 정수형 변수 grade 선언
		int grade;
		// grade 3을 기억
		grade = 3;
		
		// 문자형 변수 String에 "한지수"를 기억
		String name = "한지수";
		
		// class = 2; <- 예약어(이미 사용되는 키워드)는 변수로 만들수 없음
		int schoolClass = 2;
		
		System.out.println(grade + "학년 " + name);
		System.out.println(grade + "학년 " + schoolClass + "반 " + name);
	}

}
/*
 * 순서
 * 프로젝트 > 패키지 > 클래스
 *
 * 변수(Variable Number)
 * 메모리에서 어떤 자료를 저장(기억)하는 한 개의 공간 
 * int(자료형) n(변수명) 
 *
 * 자료형 변수 이름
 * 숫자(정수형) - int n = 10
 * 숫자(실수형) - float f = 12.3F
 * 문자 1개 - char c = 'A'
 * 문자열 - String name = 'kim'
 */