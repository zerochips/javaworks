package home1;

import java.util.Scanner;

public class Switch3 {

	public static void main(String[] args) {
		// case문 동시에 사용하기
		Scanner sc = new Scanner(System.in);
		
		int month;
		int day;
		
		System.out.print("월> ");
		month = sc.nextInt();
		
		//조건
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day = 31;
			break;
		case 4: case 6: case 9: case 11:
			day = 30;
			break;
		case 2:
			day = 28;
			break;
		default:
			System.out.print("잘못 입력하셨습니다.\n다시 입력해주세요");
			return;
		}		
		
				
		//출력
		System.out.printf("%d월은 %d일 까지 입니다.", month, day);
		
		sc.close();

	}

}
