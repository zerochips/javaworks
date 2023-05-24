package singleton;

public class CompanyTest {

	public static void main(String[] args) {
		Company com1 = Company.getInstance();
		Company com2 = Company.getInstance();
		
		// 주소가 같은지 비교
		System.out.println(com1 == com2);		
		
		System.out.println(com1);  	// com1를 출력하면 메모리의 주소값이 출력되죠
		System.out.println(com2);
		
		// 싱글톤 패턴 사용해봐야죠
		
		
	}

}
