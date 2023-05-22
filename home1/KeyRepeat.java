package home1;

import java.util.Scanner;

public class KeyRepeat {

	public static void main(String[] args) {
		// while문
		// "y"키 - "계속반복", 'n'키 - "반복중단", 이외의 키 - "지원하지 않는 키 출력"
		// key == 'y'(비교안됨), 문자열비교 equals() 메서드 사용
		// if(key == "y") == 는 숫자비교할때 되고 문자사용할때는 안됩니다.
		
		Scanner sc = new Scanner(System.in);		
		
		while(true) {
			System.out.print("계속 반복할까요? ");
			String con = sc.next();
			
			
			if(con.equals("y") || con.equals("Y")) {
				System.out.println("계속 반복합니다.");
			}else if(con.equals("n") || con.equals("N")) {
				System.out.println("반복을 중단합니다.");
				break;
			}else {
				System.out.println("프로그램 종료!");
			}
			
			
			/*// 문자열에선 문제발생. 
			  // 문자열에선 무조건 equals("") 사용
			if(con == "y" || con == "Y") {
				System.out.println("반복합니다.");
				break;
			}else if(con == "n" || con == "N") {
				System.out.println("반복을 중단합니다.");	
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");				
			}
			System.out.println("프로그램을 종료합니다.");
			*/
			
		}
		sc.close();

	}

}
