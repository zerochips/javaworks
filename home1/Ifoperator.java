package home1;

import java.util.Scanner;

public class Ifoperator {

	public static void main(String[] args) {
		// 두 수의 사칙 연산 프로그램 - if문
		// switch~case와 다른게 if문은 각자가 break문을 가지고 있다고도 볼 수 있다.
		double num1 = 150;
		double num2 = 17.25;
		String operator = "*";
		double result = 0;
		
		// if 조건문
		if(operator == "+") {
			result = num1 + num2;
		}else if(operator == "-") {
			result = num1 - num2;
		}else if(operator == "*") {
			result = num1 * num2;
		}else if(operator == "/") {
			result = num1 / num2;
		}else {
			System.out.println("잘못 입력하셨습니다.\n다시 입력해주세요.");
			return;
		}	
		
		
		//결과값 출력
		System.out.printf("결과값: %,.2f", result );

	}

}
