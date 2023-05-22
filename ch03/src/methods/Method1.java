package methods;

public class Method1 {
	
	// main() 함수
	public static void main(String[] args) {
		// 객체(클래스에서 만드는 인스턴스) - 메모리에 로딩
		Method1 method = new Method1();
		
		// 클래스 이름(주소) - 패키지이름.클래스이름
		// methods.Method1@58ceff1 - 패키지.클래스	
		System.out.println(method);
		
		// 함수 호출
		sayHello();
		System.out.println(square(3));
		
		
	}
	// sayHello() 함수 생성(return 없는 함수 - void)
	// static을 붙인 이유 - 호출하는 쪽에서 new 객체 생성을 하지 않을때 사용
	public static void sayHello() {
		System.out.println("Hello~");
	}
	
	// 제곱수를 계산하는 함수 - (return 있는 함수 - int형으로 변환)
	// 매개변수를 int x라고 할게요
	public static int square(int x) {
		return x * x;
	}	

}

/*
 * static - 정적영역(값을 누적, 공유)
 * 파이썬 - global
 * 클래스 - 객체 생성
 * 1. new 키워드 사용(Scanner sc = new Scanner)
 * 2. Math.round() - static -> Math가 클래스로 되어있어요 static을 사용하면 new를 안쓰는 겁니다.
 * 
 * 
 */