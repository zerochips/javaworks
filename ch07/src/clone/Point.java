package clone;

public class Point {
	// 필드
	int x;
	int y;
	
	// 생성자
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}

	// 객체의 문자열 정보 출력 메서드
	@Override
	public String toString() {
		return "x=" + x + ", y=" + y;
	}
	
	
	
	

}
