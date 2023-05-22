package var;

public class CharType {

	public static void main(String[] args) {
		// 문자 자료형
		System.out.println("*** 아스키 ***");
		char ch1 = 'A';
		int ch2 = 66;		
				
		// (int)를 문자 'A'가 코드값으로 출력됨
		// 강제 형변환(캐스트)
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		System.out.println(ch2);
		System.out.println((char)ch2);
		
		System.out.println("*** 유니코드 ***");
		char uniCode1 = '가';
		// 유니코드 char형이기 때문에 '' 홀 따옴표 사용
		char uniCode2 = '\uac00';
		
		System.out.println(uniCode1);
		System.out.println(uniCode2);
		
		// 영어 소문자 전체 출력
		for(char c=97; c<123; c++) {
//			System.out.println(c);
			System.out.print(c);
//			System.out.print(c + " ");
		}
		
	}

}

/*
영대 - 26
A = 100001

영소 - 26
숫자 - 10
특수문자 - 33
제어문자 - 33
128개 - 7비트
11000자 - 2바이트 : 65536*/
