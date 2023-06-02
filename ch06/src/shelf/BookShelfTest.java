package shelf;

public class BookShelfTest {

	public static void main(String[] args) {
		// BookShelf의 객체 생성
		BookShelf bookShelf = new BookShelf();
		
		// 자료 삽입
		bookShelf.enQueue("반응형 웹"); 	// 책장에 책 하나를 넣었죠 // 책장 책 1권 넣음
		bookShelf.enQueue("혼공 Java");
		bookShelf.enQueue("스프링 부트");
		
		// 리스트 요소의 개수
		System.out.println(bookShelf.getSize() + "권");	//getSize() 붙이면 들어있는 수 출력
		
		// 자료 출력(맨 앞에서 삭제되고 출력됨)
		System.out.println(bookShelf.deQueue()); 	// 
		System.out.println(bookShelf.deQueue()); 	// 
		System.out.println(bookShelf.deQueue()); 	// 

	}

}

/*
인터페이스 추상
클래스가 
go(int)템플릿메서드



 * */
