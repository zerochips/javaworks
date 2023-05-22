package methods;

public class OneUp2 {
	
	// *** OneUp과 다른점 ***
	// 정적변수는(메모리에 고정되어있다는 말입니다.) 프로그램이 소멸(종료)될 때 소멸하고, 값을 계속 유지(공유)
	// static이 붙은 x는 정적 변수라고 하죠
	// static이 안 붙어있으면 new를 해야하죠
	static int x = 0;  // static이 붙은 변수(x)는 정적 변수
	
	// 1씩 증가하려면
	// static이 붙은 함수라고 하죠
	public static int oneUp() {
		// x += 1; static 을 붙여서 호출해줘야함
		x += 1;
		return x;
	}

	public static void main(String[] args) {
		
		System.out.println(oneUp());	// 1출력됨
		System.out.println(oneUp());	// 2출력됨
		System.out.println(oneUp());	// 3출력됨
		
		// x값 확인
		System.out.println("마지막에 저장된 값: " + x);

	}

}
