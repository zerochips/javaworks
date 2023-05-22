package home1;

import java.util.Scanner;

public class Seat {
	
	public static void main(String[] args) {
		// 입장객 수에 따른 열과 줄수 계산하기
		// Scanner 생성
		Scanner sc = new Scanner(System.in);		
		
		// 필요한 객체? 생성
		int customer;
		int col;
		int row;		
		
		System.out.print("입장객 수를 입력해 주세요> ");
		customer = sc.nextInt();
		
		System.out.print("열수를 입력해주세요> ");
		col = sc.nextInt();
		
		// if문
		if(customer % col == 0 ) {
			row  = customer / col;
		}else {
			row = customer / col + 1;
		}		
		
		
		//출력
		System.out.printf("%d개의 줄이 필요합니다.", row);
		
		
	
		sc.close();
	}
}
