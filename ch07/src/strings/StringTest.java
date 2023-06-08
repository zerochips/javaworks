package strings;

public class StringTest {

	public static void main(String[] args) {
		
		String javaStr = new String("java");
		String androidStr = new String("android");
		
		// 객체의 메모리 주소 확인할 때 사용 - System.identityHashCode(javaStr)
		System.out.println(javaStr);
		// String으로 만든 객체의 주소를 볼때는 아래처럼 확인하면 됩니다.
		System.out.println("처음 문자열 주소값: " + System.identityHashCode(javaStr));
		
		System.out.println(androidStr);
		System.out.println("처음 문자열 주소값: " + System.identityHashCode(androidStr));
		
		// 문자열 연결 - concat() 사용 -> 메모리 주소가 처음과 바뀜
		// 내부에 변경 불가능한 final char[] 변수를 가지고 있음
		javaStr = javaStr.concat(androidStr);
		System.out.println(javaStr);
		System.out.println("연결후 주소값: " + System.identityHashCode(javaStr));
		
	}

}

/* 문자열 더하기 - concat()
 * String - 메모리 주소 변경
 * StringBuilder - 메모리 주소 변경 안됨
 * 해시코드 - 메모리의 주소
 */
