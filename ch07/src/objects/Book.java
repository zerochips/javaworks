package objects;

public class Book {
	
	// 필드
	int bookNumber;
	String bookTitle;
	
	// 생성자	
	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	// toString() 재정의
	@Override
	public String toString() {
		return bookNumber + ", " + bookTitle;
	}

	// equals() 재정의
	// 재정의 했는데도 안되는경우가 있는데 그럴때는 hashCode() 를 확인해야한다.
	// #을 hash라고 하죠~ hash는 정보를 저장하고 검색하기 위해 사용하는 자료 구조 // hashCode()메서드는 인스턴스의 저장 주소를 반환함
	@Override
	public boolean equals(Object obj) {	// Object obj는 Override 로 가져오면 같이 들어있네~
		// 강제형변환 object가 더 크니까요~ 맞춰줄게요 Book을 넣어서 다운그레이딩 됐죠 - instanceof 사용
		if(obj instanceof Book) {	// obj의 Book의 인스턴스(객체)라면
			Book book = (Book)obj;
			if(this.bookNumber == book.bookNumber) {	
				return true;	// true 반환
			}			
		}
		return false;
	}

	
	// hashCode() 재정의
	@Override
	public int hashCode() {
		return bookNumber;	//해시코드 반환값과 같은 의미 - 무조건 int로 나가는 겁니다 String bookNumber 라면 
	}
	
	
	
	
}
