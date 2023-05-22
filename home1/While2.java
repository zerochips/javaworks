package home1;

public class While2 {

	public static void main(String[] args) {
		// while문 - 반복조건문(if~ break)	
		int i =0;
		int sum = 0;
		
		while(true) {
			i++;			// i는 1씩 증가해라
			
			if(i > 10) {	// i가 10보다 크면 빠져나와라
				break;
			} //if 종료
			
			sum += i;
			System.out.print(i + " ");
		}// i값 출력 1~10까지 출력됨
		
		
		System.out.println();
		System.out.println("합계: " + sum);
	}// 합계 출력 종료

}
