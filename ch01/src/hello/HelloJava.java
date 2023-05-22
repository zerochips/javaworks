package hello;

public class HelloJava {

	public static void main(String[] args) {
		// 입출력 알아보기
		// 줄바꿈 설정
		System.out.print("Hello~ Java!\n");
		// printIn() - 줄바꿈되며 출력
		System.out.println("Hello~ Java!");
		System.out.println(2.54);
		// 불리언(boolean) - true
		System.out.println(10 > -10);
		System.out.println(10+11);
		// 한 문자는 홀따옴표 사용 - '1'(홀따옴표) 아스키코드 49 (10 + 49) 로 연산하여 59로 출력됨
		System.out.println(10 + '1');
		// 쌍따옴표 - 문자로 인식 (10 + "1") 은 101 로 출력됨
		// 큰 자료형쪽으로 자동 형변환
		System.out.println(10 + "1");
		System.out.println(10 + "11");
	}//main() 닫기

}//class 닫기 - 클래스 이름은 첫글자를 대문자로 씀

// 파이썬은 인터프리터라고해서 한 줄 실행이 됐어요
// java는 컴파일러 - hello.java -> hello.class(hello.class는 기계어 입니다)
/*
 * 여러줄 주석 
 * 자료형 - 숫자, 문자, 불리언, 배열
 *
 * 파이썬3 언어(라이브러리, 에디터, 스크립트) - 파이참, 주피터노트북
 * 자바 - JDK(자바 개발 키트) 11버전(다운순서1) - 이클립스 (다운순서2)
 * 웹 - VSCODE
 * 일반인 이미 설치됨 - JRE(자바 실행 환경) -> JVM(자바가상머신) 
 */ 
 