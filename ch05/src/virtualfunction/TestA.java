package virtualfunction;

public class TestA {
	// 필드
	int num;
	
	//메서드 void 앞에 static을 붙이면 TestA a1 = new TestA(); 이거 안해도 된다고 했죠~
	void aaa() {
		System.out.println("aaa() 출력");
	}
	
	public static void main(String[] args) {
		// 가상 메서드 이해를 위한 코드 구현
		// 인스턴스(객체)는 - 힙 메모리에 위치
		// 메서드 - 정적영역(데이터 영역) - static
		TestA a1 = new TestA();
		a1.num = 10;
		a1.aaa();
		
		TestA a2 = new TestA();
		a2.num = 20;
		a2.aaa();
		
	}

}
