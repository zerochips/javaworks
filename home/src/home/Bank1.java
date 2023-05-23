package home;

import java.util.Scanner;

public class Bank1 {

	public static void main(String[] args) {
		// 은행 업무 - 예금, 출금, 전고확인 
		Scanner sc = new Scanner(System.in);
		
		int balance = 0;
		int money = 0;
		
		
		System.out.println("============================");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("============================");
		
		// nextLine() - 문자열 불러옴, nextInt() - 정수를 불러옴
		// 받을 입력창 만들기
		System.out.print("선택> ");
		int choice = Integer.parseInt(sc.nextLine());
		
		switch(choice) {
		case 1:
			// 받을창, 잔고, 머니
			System.out.print("예금> ");
			money = Integer.parseInt(sc.nextLine());
			balance += money;
			System.out.printf("%,d원 정상처리 되었습니다.", money);
		case 2:
			System.out.println("출금> ");
			
		}
		
		

	}

}
