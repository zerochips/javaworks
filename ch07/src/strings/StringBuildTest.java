package strings;

public class StringBuildTest {

	public static void main(String[] args) {
		
		String javaStr = new String("java");
		System.out.println("처음 문자열 주소값: " + System.identityHashCode(javaStr));
		
		// 이전 문자열 객체를 넣었구요 (javaStr)
		// buffer의 메모리 주소값은 문자 연결후라도 변경되지 않음.
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println("연산 전 주소값: " + System.identityHashCode(buffer));
		
		// 문자열 연결
		buffer.append(" and ");
		buffer.append(" android ");
		buffer.append(" programming is fun!! ");
		
		System.out.println("연산 후 주소값: " + System.identityHashCode(buffer));
		
		System.out.println(buffer);
		System.out.println(buffer.toString());
		
		
		
	}

}
