package forexample;

public class NestedFor {

	public static void main(String[] args) {
		// 중첩 for문 - 5행 5열
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("$");		// println으로 하면 세로 출력
			}
			System.out.println();
		}
		// 별찍기 - 삼각형
		// 행은 그대로죠 열이 바뀌는거죠
		for(int i=1; i<=5; i++) {			// 1부터 시작하면 <=
			for(int j=1; j<=i; j++) {		// j < i
				System.out.print("*");		// println으로 하면 세로 출력
			}
			System.out.println();
		}
		
		for(int i=1; i<=5; i++) {			// 역삼각형 // 별 5개부터 별 1개 감소 
			for(int j=1; j<=6-i; j++) {		// j <= 6 - i
				System.out.print("*");		// println으로 하면 세로 출력
			}
			System.out.println();
		}
		
		// 역 삼각형 - 감소 연산자(j--) 사용
		for(int i=1; i<=5; i++) {			// 역삼각형 	// 줄
			for(int j=5; j>=i; j--) {		// j >= i;	// 별
				System.out.print("*");		// println으로 하면 세로 출력
			}
			System.out.println();
		}
		
		// 중첩 for문(5행 5열) - 숫자 1증가 프로그램
		for(int i=0; i<4; i++) {				// 4줄 생성
			for(int j=1; j<=5; j++) {			// 5열 생성
				int num = 5 * i + j;			// 앞의 5는 col의 종료값
				System.out.print(num + " ");	// println으로 하면 세로 출력
			}
			System.out.println();
		} 

	}

}
