package classpart;

public class Number {

	int x;	// 멤버 변수 클래스 안에서는 멤버라는 말을 사용하죠
	
	public Number() {	// 생성자
		x = 4;
	}	
	
	// 매개변수 한 번 넣어볼게요
//	public Number(int y) {	// 매개변수가 있는 생성자
//		x = y;
//	}
	
	public Number(int x) {	// 매개변수가 있는 생성자
		// 외부에서 입력한 변수와 멤버 변수 이름을 같은 이름으로 사용하고 싶을때 this 키워드 사용한다
		this.x = x;
	}
	
	public static void main(String[] args) {
		
		// 자기 안에 있는 클래스를 사용할 수 있어요	
		// 기본생성자로 생성
		Number myObj = new Number();
		System.out.println(myObj.x);
		
		// 매개변수가 있는 생성자로 생성
		Number myObj2 = new Number(4);
		System.out.println(myObj2.x);

	}

}
