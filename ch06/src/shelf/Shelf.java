package shelf;

import java.util.ArrayList;

public class Shelf {
	// 자료형으로 쓸겁니다
	// 자료 구조(물리적)가 ArrayList 입니다.
	// private -> 상속하기 위해 protected 로 변경함
	protected ArrayList<String> shelf;
	
	// 생성자
	public Shelf() {
		shelf = new ArrayList<>();	// ArrayList<>() 기억하자~~~~~
	}
	
	// 반환
	public ArrayList<String> getShelf(){
		return shelf;
	}
	
	
}
