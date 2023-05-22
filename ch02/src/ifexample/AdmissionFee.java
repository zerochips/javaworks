package ifexample;

public class AdmissionFee {

	public static void main(String[] args) {
		// 놀이공원 입장료 계산
		// 나이별 - 8세 미만 1000, 14세 미만 2000, 20세 미만 2500, 일반인 3000
		int age = 50;
		int fee = 0;  // 변수 초기화 -> int fee = 0; // 입장료 0을 기억해서 설정함
		
		if(age < 8) {
			fee = 1000;
			System.out.println("미취학 아동입니다.");
		}else if(age >= 8 && age < 14) {
			fee = 2000;
			System.out.println("초등학생 입니다.");
		}else if(age >= 14 && age < 20) {
			fee = 2500;
			System.out.println("청소년 입니다.");
		}else if(age >=20 && age < 65) {
			fee = 3000;
			System.out.println("일반인 입니다.");
		}else{
			fee = 0;
			System.out.println("우대시민 입니다.");
		}
		System.out.printf("입장료는 %,d원 입니다.", fee);

	}

}

/* %,d <- 천단위 구분*/