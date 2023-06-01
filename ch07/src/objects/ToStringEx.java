package objects;

public class ToStringEx {

	public static void main(String[] args) {
		
		//String name = "강하늘";				// 이건 약간 상수같은 개념입니다.
		String name = new String("강하늘");	// name 객체
		
		System.out.println(name);			// String은 이미 문자열로 바꿔놨어요
		// toString() - 객체의 정보를 문자로 출력
		System.out.println(name.toString());
		
		System.out.println("==================");
		
		Book book = new Book(1, "혼공 자바");
		System.out.println(book);
		System.out.println(book.toString());	// toString 문자열로 하는건데 안나오죠~ 재정의를 해줘야 됩니다.
		
	}

}
