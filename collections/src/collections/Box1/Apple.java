package collections.Box1;

public class Apple {
	
	private String name;
	
	//생성자 - (초기화 해주세요)
	public Apple(String name) {
		this.name = name;
	}
	
	// 이름에 접근하는 방법 
	// 1. get, set
	// 2. toString() 재정의
	// List > ArrayList(싱글스레드-작업 단위를 스레드라고 한다.), Vector(중복허용, 순서있고, 멀티스레드)
	// Set > HashSet(중복이 없고, 순서가 없고)
	@Override
	public String toString() {
		return name;
	}
	
	
	
}
