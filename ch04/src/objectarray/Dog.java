package objectarray;

public class Dog {
	// db 테이블 만들고 할 때는 private 넣어야 합니다.
	private String dogName;
	private String type;
	
	// 기본 생성자로 할게요.
	public Dog() {}
	
	
	// set()
	// 강아지 이름을 생성하는 메서드
	public void setDogName(String dogName) {
		this.dogName = dogName;
	}
	
	// 강아지 이름을 가져오는 메서드
	public String getDogName() {
		return dogName;
	}
	
	// 강아지 종류를 입력하는 메서드
	public void setType(String type) {
		this.type = type;
	}
	
	// 강아지 종류를 가져오는 메서드
	public String getType() {
		return type;
	}
	
}
