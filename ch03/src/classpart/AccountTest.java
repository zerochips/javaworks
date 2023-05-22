package classpart;

import hiding.Account;

public class AccountTest {

	public static void main(String[] args) {
		// 계좌 생성
		Account account = new Account("1000-1234", "김", 10000);
		
		System.out.println(account.getAno());
		System.out.println(account.getOwner());
		System.out.printf("잔고: %,d원", account.getBalance());
	}

}
