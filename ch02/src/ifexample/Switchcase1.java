package ifexample;

public class Switchcase1 {

	public static void main(String[] args) {
		// switch ~ case문 (조건의 값이 정해져 있을때)
		// 순위에 따른 메달 색상 출력
		// int rank = 2; 여기가 숫자라 case 변수 부분도 숫자로 들어감 case 1:
		int rank = 4;
//		char medalColor = ' ';  // 공백 문자로 초기화 쌍따 하니까 빨간줄 생김
		String medalColor = "Silver";
		
		switch(rank) {
		case 1:
			medalColor = "Gold";
			break;
		case 2:
			medalColor = "Silver";
			break;
		case 3:
			medalColor = "Bronz";
			break;
		default:
//			System.out.println("메달이 없습니다.");
			medalColor = "None";
			break;
		}
		System.out.println("메달 색깔은 " + medalColor + "입니다.");

	}

}
/*
 파일 이름은 public이 붙어야 한다.
 */
 