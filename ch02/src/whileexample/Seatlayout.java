package whileexample;

import java.util.Scanner;

public class Seatlayout {

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
//					rowNum = (customer / colNum) + 1;		// 
			rowNum = (int)(customer / colNum) + 1;	// 실수로 나오기 때문에 (int)정수로 설정해줌
		}		
		
		for(int i=0; i<rowNum; i++) {				// 4줄 생성
			for(int j = 1; j <= colNum; j++) {		// 5열 생성
				int num = colNum * i + j;			// 앞의 5는 col의 종료값
				if(num > customer)					// if문으로 계산 - 여기에서 좌석23이 나오게끔 계산됨
					break;
				System.out.print("좌석" + num + " ");		// println으로 하면 세로 출력
			}
			System.out.println();
		} 
		
		sc.close();

	}		
}