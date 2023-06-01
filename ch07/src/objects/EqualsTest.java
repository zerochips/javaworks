package objects;

public class EqualsTest {

	public static void main(String[] args) {
		
		String name1 = new String("오상식");
		String name2 = new String("오상식");
		
		//객체의 메모리 주소가 같은지 확인해 보겠습니다
		//객체의 메모리 주소 비교
		System.out.println(name1 == name2);			// false
		//객체의 값을 비교(문자열)
		System.out.println(name1.equals(name2));	// true
		
		Book book1 = new Book(1, "혼공자바");
		Book book2 = new Book(1, "혼공자바");
		
		System.out.println(book1 == book2);			// false
		System.out.println(book1.equals(book2));	// false - true가 나와야하는데 false로 나오죠~ 다시 재정의를 해줘야합니다.
		
		// hashCode() 테스트 - 10진수 8비트로 출력되네요
		// hashCode 가 메모리(인스턴스) 주소를 반환한다(10진수 출력)
		System.out.println(name1.hashCode());	// hashCode 재정의가 되어있어서 동일하게 나오죠 
		System.out.println(name2.hashCode());	// hashCode() 는 같네요~ 메모리 주소는 달라~
		
		// book1, book2는 다름 - 재정의 하면 같아짐 - 재정의 하지 않아서 다른 값이 출력되죠
		System.out.println(book1.hashCode());
		System.out.println(book2.hashCode());
		
	}

}
