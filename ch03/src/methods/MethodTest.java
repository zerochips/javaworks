package methods;

// MethodEx인 클래스를 만들기
class MethodEx{
	// static을 붙인 이유 - 호출하는 쪽에서 new 객체 생성을 하지 않을때 사용
	// 메인 클래스위에 서브 클래스를 만들었죠
	
	// sayHello() 함수 생성
	public void sayHello() {
		System.out.println("Hello~");
	}
	
	// 이름이 매개변수인 sayHllo() 함수 작성
	public void sayHllo2(String name) {
		System.out.println("Hello~ " + name);
	}
	
	// 두 수를 더하는 함수
	public int add(int x, int y) {
		return x + y;
	}
}

public class MethodTest {

	public static void main(String[] args) {
		
		// sayHello() 사용(호출), 객체 이름.함수이름()
		MethodEx method = new MethodEx();
		method.sayHello();
		
		// sayHell2() 호출				
		method.sayHllo2("김민정");
		method.sayHllo2("김민정2");
		
		// add() 함수 호출
		int value = method.add(10, 20);
		System.out.println(value);

	}

}
