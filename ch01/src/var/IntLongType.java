package var;

public class IntLongType {

	public static void main(String[] args) {
		// int - 4byte : 32bit(-21억 ~ 21억)
		int iNum = 1234567890;	//21억 초과하면 에러 발생 - long 자료형 사용해야함
		
		// long 자료형(8byte-64bit)은 int와 구분하기 위해 끝에 'L(대문자)' or 'l(소문자)'을 붙임
		long lNum = 12345678900L;
//		System.out.println(iNum);
//		System.out.println(lNum);
		System.out.println("int형 :" + iNum);
		System.out.println("long형 :" + lNum);

	}

}

/*
 * 정수 자료형의 종류 및 크기 [ 수의 범위 ] 4page, 찾아보기 
 * Sysout 치고 ctrl + space 하면 자동 기입
 *
 */
