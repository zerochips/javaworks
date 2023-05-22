package home1;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입금, 출금, 잔고, 종료		
		int money = 0;			// 입금금액
		int bank = 0;			// 잔고		
		boolean value = true;	//상태 실행변수		
		
		while(value) {
			System.out.print("시작하시겠습니까?(y/n)> ");
			String start = sc.nextLine();
			
			if (start.equalsIgnoreCase("y")) {
				while(value) {
					try {								
						System.out.println("=============================");
						System.out.println("1.입금 | 2.출금 | 3.잔고 | 4.종료");
						System.out.println("=============================");	
						
						System.out.print("선택> ");
						int choice = Integer.parseInt(sc.nextLine());
						
						switch(choice) {
						case 1:
							System.out.print("예금액> ");
							money = Integer.parseInt(sc.nextLine()); 
							bank += money;
							System.out.printf("%,d원 정상처리 되었습니다.\n", money);
							break;
						case 2:
							System.out.print("예금액> ");
							money = Integer.parseInt(sc.nextLine());
							bank -= money;
							System.out.printf("%,d원 정상처리 되었습니다.\n", money);
							break;			
						case 3:
							System.out.printf("잔고> %,d\n", bank);
							System.out.printf("%,d원 정상처리 되었습니다.\n", money);
							break;
						case 4:				
							value = false;
							break;					
						default:
							System.out.println("서비스되지 않는 번호입니다.\n표시된 번호를 눌러주세요");
							break;				
					}//switch				
					
					} catch (NumberFormatException e) {
		                System.out.println("잘못 입력하셨습니다.\n다시 입력해주세요.");
		            }// try - catch
					
		        }//while 2
				
		    } else if (start.equalsIgnoreCase("n")) {
		        System.out.println("처음으로 돌아갑니다.");
		        continue;
			}else{// if ~ else
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
		}//while 1

	    sc.close();
	}//main
	
}// class