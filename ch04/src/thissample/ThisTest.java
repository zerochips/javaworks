package thissample;

public class ThisTest {

	public static void main(String[] args) {
		Birthday bDay = new Birthday();
		bDay.setYear(2023);
		
		// 객체 주고 비교(같음) 원래는 달라야하죠~ 그런데 this는 같다~
		System.out.println(bDay);	// bDay주소출력 16진수 - 7c30a502
		bDay.printThis();
		
		
	}

}
