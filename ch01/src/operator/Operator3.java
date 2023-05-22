package operator;

public class Operator3 {

	public static void main(String[] args) {
		// 조건 연산자 - 비교문 ? 참 : 거짓
		boolean bool = (5 > 3) ? true : false;
//		char ch = (5 > 3) ? 'T' : 'F';
		
		System.out.println(bool);
//		System.out.println(ch);

		// 부모님의 나이 비교
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;
		ch = (fatherAge > motherAge) ? 'T' : 'F';
		System.out.println(ch);

	}

}

/*
 정수 : byte < short < int < long
 실수 : float < double
 문자 : char < String
 불리언 : boolean
 
 println(출력대상)
 printf("문자열", 변수)
 
 
 */
 