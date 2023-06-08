package classes;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		// String 클래스의 여러 가지 정보를 알고싶은 겁니다.
		Class class1 = Class.forName("java.lang.String");
		
		// 이름 부터 가지고와볼게요
		System.out.println(class1.getName());
		
		// 생성자
		System.out.println("**** 생성자 정보 ****");
		Constructor<?>[] cons = class1.getConstructors();
		// 배열이니까 for문 써야죠 향상된 for문을 사용해볼게요
		for(Constructor<?> con : cons) {
			System.out.println(con);
		}
		System.out.println(); 
		
		System.out.println("**** 필드 정보 ****");
		Field[] fields = class1.getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field);
		}		
		System.out.println();
		
		System.out.println("**** 메서드 정보 ****");
		Method[] methods = class1.getMethods();
		for(Method method : methods) {
			System.out.println(method);
		}
		
		
	}

}
