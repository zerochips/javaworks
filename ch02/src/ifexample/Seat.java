package ifexample;

import java.util.Scanner;

public class Seat {

	public static void main(String[] args) {
		// 입장객 수에 따른 열과 줄수 계산하기
		Scanner sc = new Scanner(System.in);
		int customer;	// 입장객 수 저
		int colNum;		// 좌석 열 수 저장
		int rowNum;		// 줄(행)의 수 저장
		
		System.out.print("입장객 수 입력: ");
		customer = sc.nextInt();
		
		System.out.print("좌석 열 수 입력: ");
		colNum = sc.nextInt();
		
		// 연산 처리(조건문)
		if(customer % colNum == 0) {
			rowNum = customer / colNum;				// 나누는 몫
		}else{
//			rowNum = (customer / colNum) + 1;		// 
			rowNum = (int)(customer / colNum) + 1;	// 실수로 나오기 때문에 (int)정수로 설정해줌
		}		
		
//		System.out.println(rowNum + "개의 줄이 필요합니다.");
		System.out.printf("%d개의 줄이 필요합니다.\n", rowNum);
		
		sc.close();

	}

}

/*
 * 파이썬 12/5 =2.4 float() 로 출력됨
 * 자바 12/5 = 2 int() 형으로 출력됨 12와 5 모두 int형이기 때문에 인트로 출력됨
 * 
 */
