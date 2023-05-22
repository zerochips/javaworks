package methods;
	
	// 메소드 이름은 첫글자가 대문자죠
public class OneUp {
	
	// *** OneUp2와 다른점 ***
	// 숫자1이 증가하는 함수
	// 함수 이름은 첫글자 소문자입니다.
	public static int oneUp() {
		// x는 값을 변환한 후 소멸
		int x = 0;
		x = x + 1;
		return x;
	}

	public static void main(String[] args) {
		// 매번할 때마다 초기화 돼서 1이 나오죠
		System.out.println(oneUp());	// 1
		System.out.println(oneUp());	// 1
		
		// x값 확인
		// x는  컴파일 오류
		//System.out.println(x); // x에 빨간 라인이 생기는건 변수선언 안했다고 알려주는 말입니다. 변수로 인정할 수 없다. 지역변수 x는 값을 반환한 후에 소멸한다. 소멸했기 때문에 오류가 뜸

	}

}
