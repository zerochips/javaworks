package home1;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		// 두 수의 사직 연산 프로그램
		Scanner sc = new Scanner(System.in);
		
		// 정의
		double num1;
		double num2;
		String operator = "";	
		double result;
		
		// 받을 입력값
		System.out.print("첫번째 수를 입력해주세요> ");
		num1 = sc.nextDouble();
		
		System.out.print("두번째 수를 입력해주세요> ");
		num2 = sc.nextDouble();
		
		System.out.print("연산자를 입력해주세요> ");
		operator = sc.next();
		
		// switch 계산
		switch(operator) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		default:
			System.out.println("사칙연산만 가능합니다.\n다시 입력해주세요:)");
			return;
		}
		
		//출력
		System.out.printf("합계: %,.2f", result);
		
		sc.close();
	}

}
