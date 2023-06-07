package exception;

public class ThrowsException {

	public static void main(String[] args) {
		
		try {
			findClass();
			System.out.println("클래스가 존재함.");
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();	// 추적함
			System.out.println("클래스가 존재하지 않습니다.");
		}
		

	}
	
	public static void findClass() throws ClassNotFoundException {
		// 클래스를 찾는
		//Class.forName("java.lang.String");
		// throws - 예외처리 미루기(사용하는 쪽에서 try~ catch함) // 위에 main 보면 했죠
		Class.forName("java.util.ArrayList2");
	}

}

/*
String 관련 문자열 함수
문자객체.charAt(인덱스)
문자객체.indexOf("문자")

쿠키 (cookie) - 영수증 발급 가능

JSP - EL, JSTL(템플릿 언어)
${member.id} <- <%= %> 
  
*/
