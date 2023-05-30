package banking.bankarray;

import java.util.Scanner;

public class BankMain {
	
	// 배열을 이해하고 복습할것!!!!!
	
	// 클래스의 전역에 Account를 만들었고
	// 통장 계좌를 만들 객체 배열 100개 생성
	// static을 쓰니까 static 해야죠
	static Account[] accountArray = new Account[100];	// 전역은 아닌데 전역에 위치하는 배열이다. 정적 영역이죠
	static Scanner scanner = new Scanner(System.in);
	
	

	// 메인은 호출만 할겁니다.
	public static void main(String[] args) {
		// 상태 변수 만들게요
		// 실행과 종료를 시켜야 하니까
		boolean run = true;
		
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택> ");			
			
			// 메뉴 선택 변수
			// scanner가 들어가면 대기합니다.
			// selectNo도 지역변수죠~
			int selectNo = Integer.parseInt(scanner.nextLine());	// 문자를 숫자형으로 변환하구요
			
			
			if(selectNo == 1) {
				creatAccount();		// 계좌 생성
			}else if(selectNo == 2) {
				
				getAccountList();	// 계좌 목록			
			}else if(selectNo == 3) {
				deposit();			//예금
			}else if(selectNo == 4) {
				withdraw();			//예금
			}
			else if(selectNo == 5) {
				run = false;
				System.out.println("프로그램을 종료합니다.");
			}else {
				System.out.println("지원되지 않는 기능입니다. 다시 입력해주세요.");
			}
			
		}//while() 끝	
		
	}// main() 끝
	
	//계좌를 생성하는 함수
	private static void creatAccount() {
		System.out.println("-------------------------------------------");
		System.out.println("계좌생성");
		System.out.println("-------------------------------------------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		
		System.out.print("계좌주: ");
		String owner = scanner.nextLine();
		
		System.out.print("초기입금액: ");
		int balance = Integer.parseInt(scanner.nextLine());
		
		// 첫번째 계좌 생성
		//accountArray[0] = new Account(ano, owner, balance); 
		for(int i =0; i < accountArray.length; i++) {			// 전체 배열을 반복하면서
			//0번 인덱스가 새로 수정되는 문제 해결
			// null 일때만 새 계좌가 생성된다
			if( accountArray[i] == null) {	// 계좌가 저장되지 않는 인덱스에 저장 - null일때만 계좌가 생성되니까 이미 생성된 계좌가 있으면 지워지지 않음(대체되지 않음)
				accountArray[i] = new Account(ano, owner, balance);	// 계좌를 생성			
				System.out.println("결과: 계좌가 생성되었습니다.");	
				break;
			}
			
		}		
	}
	
	// 계좌 목록을 출력하는 메서드
	private static void getAccountList() {
		
		for(int i =0; i < accountArray.length; i++) {
			if(accountArray[i] != null) {					// 배열의 요소가 null이 아닌 경우(계좌가)
				//Account account = accountArray[i];			// 출력할 계좌 저장
				System.out.print("계좌번호: " + accountArray[i].getAno() + "\t");
				System.out.print("계좌주: " + accountArray[i].getOwner()+ "\t");
				System.out.print("잔액: " + accountArray[i].getBalance() + "\n");
				
			}
		}
	}
	
	// 5월 23일
	// 3번 - 계좌에 입금하는 메서드
	private static void deposit() {
		System.out.println("-------------------------------------------");
		System.out.println("계좌생성");
		System.out.println("-------------------------------------------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		
		System.out.print("입금액: ");
		int money = Integer.parseInt(scanner.nextLine());
		
		// 입금이 잘 되는지 보겠습니다.
		if(findAccount(ano) != null) {	// 계좌를 찾았다면(반환값이 있다면)
			//예금 = 잔고 + 예금액
			Account account = findAccount(ano);
			account.setBalance(account.getBalance() + money);
			System.out.println("결과: 정상처리 되었습니다.");
		}else{
			// 여기는 null일때
			System.out.println("결과: 계좌가 없습니다.");
		}		
	}
	
	
	
	// 4번 - 계좌에서 출금하는 메서드
	private static void withdraw() {
		System.out.println("-------------------------------------------");
		System.out.println("계좌생성");
		System.out.println("-------------------------------------------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		
		System.out.print("출금액: ");
		int money = Integer.parseInt(scanner.nextLine());
		
		// 입금이 잘 되는지 보겠습니다.
		if(findAccount(ano) != null) {	// 계좌를 찾았다면(반환값이 있다면)
			//출금 = 잔고 - 예금액
			Account account = findAccount(ano);
			account.setBalance(account.getBalance() - money);
			System.out.println("결과: 정상처리 되었습니다.");
		}else{
			// 여기는 null일때
			System.out.println("결과: 계좌가 없습니다.");
		}		
	}
		
	
	// 계좌를 검색하는 메서드
	// 반환자료 형태 Account 를 
	private static Account findAccount(String ano) {
		Account account = null;	// 빈 계좌 계정을 할당
		
		// String ano 외부에서 들어오는		
		for(int i =0; i < accountArray.length; i++) {
			if(accountArray[i] != null) {		// 없는 계좌를 입력하면 null 예외발생
				String dbAno = accountArray[i].getAno();	// 이미 저장된 계정
				if(dbAno.equals(ano)) {			// 찾는 계좌와 일치하면.. 문자열 비교 = equals() 사용
					account = accountArray[i];	// 보낼때는 통으로 보내야죠 // 여러개이기 때문에 for문으로 // 계좌를 가져와 저장			
					break;						// 빠져나옴
				}
			}
		}		
		return account;
		
		
//		for(int i =0; i < accountArray.length; i++) {
//			String dbAno = accountArray[0].getAno();	// 이미 저장된 계정
//			if(dbAno.equals(ano)) {			// 찾는 계좌와 일치하면.. 문자열 비교 = equals() 사용
//				account = accountArray[0];	// 보낼때는 통으로 보내야죠 // 여러개이기 때문에 for문으로 // 계좌를 가져와 저장			
//				break;						// 빠져나옴
//			}
//		}		
//		return account;	
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//Main 클래스 끝
