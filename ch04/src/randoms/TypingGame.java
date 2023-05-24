package randoms;

import java.util.Scanner;

public class TypingGame {

	public static void main(String[] args) {
		// [ 입력창 ] 을 만들 수 있는 기본 [ 바탕 ]을 열어주고
		Scanner sc = new Scanner(System.in);
		
		// [ 문제 ]를 묶어주고
		String[] word = {"river", "mountain", "sky", "earth", "moon",
				"tree", "car", "banan", "soup", "hand"};
		// 문제번호 - 문제 [ 순서 ] 도 정해주고
		int n = 1;
		// 문제를 다 풀었을 때 [ 걸린시간 ] 도 체크해보고
		double start, end;
		
		// [ 시작 입력창 ]input 창 만들어주고
		System.out.print("영어타자 게임, 준비되면 엔터");
		sc.nextLine();		
		
		// [ 시간 스타트 ] 넣어주고
		start = System.currentTimeMillis();	// 게임 시작
		
		// 이런걸 알고리즘이라고 하나?????? 
		while( n < 11) {	// 10번까지 11번째 나옵니다.
			// [ 문자 랜덤 ] 넣어주고
			int rand = (int)(Math.random()*word.length);
			
			// 문제 [ 순서 출력 ] - 문제1, 문제2 형식으로 나옴
			System.out.println("문제" + n );
			// 랜덤으로 [ 미션 문제 ] 나옴 - 치킨, 라면
			String 문제 = word[rand];		// 문제 생성
			System.out.println(문제);		// 문제 출력
			
			// [ 사용자 ] 가 직접 [ 미션 입력 ] 하는 [ 제출창 ] - 맞으면 통, 틀리면 오타
			String 문제에 = sc.nextLine();			
			if(문제에.equals(문제)) {
				System.out.println("통과!");
				n++;	// 문제는 10까지 커질예정 while(n < 11) 이라고 표시했기 때문에
			}else {
				System.out.println("오타! 다시 도전!");
			}			
		}	
		// 시간 [ 종료 ] 넣어주고
		end = System.currentTimeMillis();	// 게임 종료
		// [ 출력 ]해주고
		System.out.printf("게임 소요 시간은 %.2f초입니다.", (end-start)/1000);
		// sc 닫아주고
		sc.close();

	}

}
