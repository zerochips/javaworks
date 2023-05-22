package ifexample;

public class Switchcase2 {

	public static void main(String[] args) {
		// case문 동시에 사용하기
		int month = 5;	// 월을 저장할 변수
		int day = 0;	// 일을 저장할 변수 // day라는 변수를 선언해놓고 case에 day를 설정해줌
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day = 31;
			break;
		case 4: case 6: case 9: case 11:
			day = 31;
			break;
		case 2:
			day = 28;
			break;
		default:
			System.out.println("지원되지 않습니다.");
			return;		// 즉시 종료 // int month에 13을 넣으면 13월은~~ 출력되기 때문에 return; 으로 해줘야함.
		}
		System.out.println(month + "월은 " + day + "일 까지 있습니다.");

	}

}
