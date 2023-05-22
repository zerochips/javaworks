package home1;

import java.util.Scanner;

public class AdmissionFee3 {

	public static void main(String[] args) {
		// 놀이공원 입장료 계산
		// 나이별 - 8세 미만 1000, 14세 미만 2000, 20세 미만 2500, 일반인 3000
		Scanner sc = new Scanner(System.in);
		
		int age;
		int charge;
		
		//boolean isFirstInput = true; // 처음 입력 여부를 저장하는 변수

		while (true) {
			try {
            System.out.print("나이 입력> ");
            age = sc.nextInt();
            sc.nextLine(); // 개행 문자 제거

            if (age < 0) {
                System.out.println("잘못 입력하셨습니다.\n다시 입력해주세요.");
                continue; // while 루프의 시작으로 돌아감
            } else {
                if (age < 8) {
                    System.out.println("미취학 아동입니다.");
                    charge = 1000;
                } else if (age < 14) {
                    System.out.println("초등학생 입니다.");
                    charge = 2000;
                } else if (age < 20) {
                    System.out.println("청소년 입니다.");
                    charge = 2500;
                } else if (age < 65) {
                    System.out.println("일반인 입니다.");
                    charge = 3000;
                } else {
                    System.out.println("우대시민 입니다.");
                    charge = 0;
                    break;
                	}
            	}			
			
            System.out.printf("요금은 %,d원 입니다.\n", charge);
			
            while (true) { 
	                System.out.print("처음으로 돌아갈까요? (y/n): ");
	                String con = sc.nextLine();
	
	                if (con.equalsIgnoreCase("y")) {
	                    break; // while 루프 종료
	                } else if (con.equalsIgnoreCase("n")) {
	                    System.out.println("프로그램을 종료합니다.");
	                    System.exit(0); // 프로그램 종료
	                } else {
	                    System.out.println("잘못 입력하셨습니다.");
	                    break;
	                }
            } // 두번째 while
        } catch (Exception e) {
            System.out.println("잘못 입력하셨습니다.\n다시 입력해주세요.");
            sc.nextLine(); // 입력 버퍼 비우기
        }
    } // 첫번째 while
    sc.close();
}
}