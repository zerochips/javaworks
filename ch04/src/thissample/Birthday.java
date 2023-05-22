package thissample;

public class Birthday {
	int year;
	int month;
	int day;
	
	// 같은 클래스에 있을 때는 public 빼도 괜찮죠~
	public void setYear(int year) {
		this.year = year;
	}
	
	// this 객체의 주소를 출력할 함수
	public void printThis() {
		System.out.println(this);
	}
}
