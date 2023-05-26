package interfaceex.calculator;

public interface Calculator {
	// 정수형 계산기	
	// 인터페이스는 변수를 컴파일 과정에서 상수로 변환함
	// final 생략되어 있음
	int ERROR = -9999;
	
	// 거의 추상메서드임
	int add(int n1, int n2);
	
	int subtract(int n1, int n2);
	
	int times(int n1, int n2);
	
	int divide(int n1, int n2);
	
}
// package Explorer 에서 패키지를 만들고 클래스를 생성한 후 
// 파일 위에 보라색 I가 붙어있으면 인터페이스 파일을 뜻함