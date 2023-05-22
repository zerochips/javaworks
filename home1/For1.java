package home1;

import java.util.Scanner;

public class For1 {

	public static void main(String[] args) {
		// 1부터 10까지 출력, 합계
		/*
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum += i;
			System.out.print(i + " ");
		}
		
		//출력		
		System.out.println();
		System.out.println("합계: " + sum);
		*/
		
		// 문자 세트 - 알파벳 출력(대문자, 소문자)
		/*
		char ch;
		
		for(ch = 65; ch < 123; ch++) {
			System.out.print(ch + " ");
		}
		*/
		
		// 유니코드 - 한글 유니코드 범위 출력 안됨
		/*
		char ch;

		for(ch = 0x1100; ch <= 0x111F; ch++) {
			System.out.print((char)ch + " ");
		}
		*/
		/*
		// 출력 버거워함.
		char ch;

		for(ch = '가'; ch <= '힣'; ch++) {
			System.out.print(ch + " ");
		}
		*/

		
		/*
		int U = 0x1100;
		int D7A3 = 0xD7A3;

		for (int i = U; i < D7A3; i++) {
		  System.out.print((char)i + " ");
		}
		*/
		
		/*
		ㄱ : U+1100
		ㄴ : U+1101
		ㄷ : U+1102
		ㄹ : U+1103
		ㅁ : U+1104
		ㅂ : U+1105
		ㅅ : U+1106
		ㅇ : U+1107
		ㅈ : U+1108
		ㅊ : U+1109
		ㅋ : U+110A
		ㅌ : U+110B
		ㅍ : U+110C
		ㅎ : U+110D
		
		한글은 유니코드에서 U+AC00~U+D7A3 범위에 할당되어 있습니다. 
		즉, 한글의 첫 글자 '가'는 U+AC00, 마지막 글자 '힣'은 U+D7A3입니다.
		*/
		
		/*
		char han;		
		
		for(han = 0xAC00; han <= 0xD7A3; han++) {
			System.out.print((char)han + " ");
		}
		*/
		
		// 구구단
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단을 입력해주세요> ");
		double dan = sc.nextDouble();
		
		for(double i = 1; i < 10; i++) {
			System.out.printf("%.1f x %.1f = %.1f\n", dan, i, dan*i);			
		}
		System.out.println();
		*/
		/*
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j <10; j++) {
				System.out.print(i + "x" + j + "=" + (i*j) + " ");
			}
			System.out.println();
			System.out.println();
		}
		*/
		
		// 구구단 - 단의 수 만큼만 계산된 값 출력
		// j가 i만큼 커져야 하니까 <= 
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.println(i + " x " + j + " = " + ( i * j ));
			}
			System.out.println();
		}
		

		//sc.close();
	}

}
