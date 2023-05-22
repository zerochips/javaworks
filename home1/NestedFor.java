package home1;

import java.util.Scanner;

public class NestedFor {

	public static void main(String[] args) {
		// 중첩 for문 - 5행 5열
		for(char i = 1; i <=5; i++) {
			for(char j =1; j <=5; j++) {
				System.out.print("*"+ " ");
			}
			System.out.println();
		}
		System.out.println();
		// 역삼각형 // 별 5개부터 별 1개 감소 
		// j 가 i 와 같거나 i만큼 커지면 되니까 j <=i 로 하면 됨
		// j 다 돌고 빠져나오면 i 커지고 
		for(char i = 1; i <= 5; i++) {
			for(char j = 1; j <= i; j++) {
				System.out.print("*"+ " ");
			}
			System.out.println();
		}
		System.out.println();
		
		// 역삼각형 	// 줄
		for(char i = 1; i <=5; i++) {
			for(char j =5; j >= i; j--) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		
		// 역삼각형
		for(char i = 1; i <= 5; i++) {
			for(char j = 1; j <= 6 - i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		
		// 중첩 for문(5행 5열) - 숫자 1증가 프로그램
		// 숫자 계산은 0부터 시작
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원수> ");
		int p = sc.nextInt();
		
		System.out.print("열의 수> ");
		int r = sc.nextInt();
		
		for(int i = 0; i <= 4; i++) {
			for(int j = 1; j <=5; j++) {
				int num = 5 * i + j;
				System.out.print(num + " ");
			}
			System.out.println();
		}
		
		
		
		

	}

}
