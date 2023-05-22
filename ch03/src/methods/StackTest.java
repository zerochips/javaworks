package methods;

public class StackTest {

	public static void main(String[] args) {
		// static 함수 호출할 때 new 사용 안함
		// 그냥 호출하면 됨.
		//int val = add(10, 11);
		//System.out.println(val);
		
		// sum 메인 함수에 있는 지역변수
		// add() 호출
		int sum = add(10, 11);
		System.out.println(sum);

	}
	
	public static int add(int n1, int n2) {	// int - 반환자료형
		// result가 없을 때 n1과 n2도 지역변수
		// result가 생겼으므로 n1과 n2는 매개변수
		// result가 지역변수
		int result = n1 + n2;
		return result;
	}
	
	

}
