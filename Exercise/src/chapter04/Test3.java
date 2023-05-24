package chapter04;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// 확인 3
		int score = 85;
		System.out.print("등급은 ");
		
		if(score < 70) {
			System.out.print("D ");
		}else if(score < 80){
			System.out.print("C ");
		}else if(score < 90) {
			System.out.print("B ");
		}else {
			System.out.print("A ");
		}
		System.out.print("입니다.\n");
		
		// 확인 4
		Scanner sc = new Scanner(System.in);		
		System.out.print("어떤 혜택을 원하세요?> ");
		String alpha = sc.nextLine();
		
		switch(alpha) {
		case "A": System.out.println("VVIP 혜택을 받으실 수 있습니다.\n막 질러봅시다 유후~ 예~아~"); break;
		case "B": System.out.println("VIP 혜택을 받으실 수 있습니다."); break;
		case "C": System.out.println("우수 회원 혜택을 받으실 수 있습니다.");
		case "D": System.out.println("일반 회원 혜택을 받으실 수 있습니다."); break;
		default: System.out.println("혜택이 없습니다.");		
		}
		System.out.println("감사합니다.");
		
		
	}

}
