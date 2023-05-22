package home1;

import java.util.Scanner;

public class Swichcase {

	public static void main(String[] args) {
		// switch ~ case문 (조건의 값이 정해져 있을때)
		// 순위에 따른 메달 색상 출력
		// int rank = 2; 여기가 숫자라 case 변수 부분도 숫자로 들어감 case 1:
		Scanner sc = new Scanner(System.in);
		
		int rank;
		String medal = null;		
		
		System.out.print("순위를 입력해주세요> ");
		rank = sc.nextInt();
		
		// switch ~ case ~ default		
		switch(rank) {
		case 1:
			medal = "금메달";
			break;
		case 2:
			medal = "은메달";
			break;
		case 3:
			medal = "동메달";
			break;
		default:
			System.out.println("메달권 밖입니다.");
			return;
		}
		System.out.printf("본 수상자는 %d위 %s 입니다.", rank, medal);
		
		// 출력
		/*
		if(rank >= 4) {
			System.out.println("메달권 밖입니다.");
		}else {
			System.out.printf("본 수상자는 %d위 %s 입니다.", rank, medal);		
		}		
		*/
		sc.close();
		

	}

}
