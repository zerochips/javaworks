package ifexample;

public class IfOperator {

	public static void main(String[] args) {
		// 두 수의 사칙 연산 프로그램 - if문
		// switch~case와 다른게 if문은 각자가 break문을 가지고 있다고도 볼 수 있다.
		double num1 = 15;
		double num2 = 2;
		char operator = '/';
		double result = 0;
		
		if(operator == '+') {
			result = num1 + num2;
		}else if(operator == '-') {
			result = num1 = num2;
		}else if(operator == '*') {
			result = num1 * num2;
		}else if(operator == '/') {
			result = num1 / num2;
		}else {
			System.out.println("[" + operator + "]" + "는 연산 불가입니다.\n다시 입력해 주세요.");
			return;
		}
//		System.out.println("결과값 : " + result);
		System.out.printf("결과값 : %.2f", result);
	}

}
