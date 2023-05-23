package arraylist;

// 불러온 클래스 확인해서 복습하세요
import java.util.ArrayList;

import objectarray.Book;

public class BookArrayList {

	public static void main(String[] args) {
		// 다른 패키지에 있는걸 import 할거니까 신경써야 합니다.
		// 책을 저장할 ArrayList의 공간 생성
		ArrayList<Book> bookList = new ArrayList<>();
		
		
		// 책 객체를 생성해서 bookList에 저장해야하죠
		// 패키지가 다를때는 접근제어자 public으로 바꿔줘야함
		Book book1 = new Book("반응형 웹사이트", "김은아");
		Book book2 = new Book("Tiny Python Project", "켄 유엔스-클락");
		Book book3 = new Book("혼자 공부하는 자바", "신용권");
		
		// bookList에 저장
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		
		// book1, book2의 정보 출력
//		book1.bookInfo();
//		book2.bookInfo();
//		book3.bookInfo();
		
		// book1의 정보(인덱싱) - 1개 가져오기
		System.out.println(bookList.get(0));	// 객체 메로리 주소가 나옴
		bookList.get(0).bookInfo();				// 객체의 정보 가져옴
		
		// bookList.size - 크기 확인
		System.out.println(bookList.size() + "개" + "\n");
		
		// 전체 요소 출력
		for(int i = 0; i <bookList.size(); i++) {
			//전체를 돌때는 get로 가지고 와서 i로 돈다.
			Book book = bookList.get(i);
			book.bookInfo();
		}
		
		// book2 삭제
		if(bookList.contains(book2)) {
			bookList.remove(book2);
		}
		
		// 향상 for문 - for(자료형 변수 : 리스트 이름){}
		for(Book book : bookList) {
			book.bookInfo();
		}

	}

}
