package home1;

public class While1 {

	public static void main(String[] args) {
		// while 반복문
		// 1부터 10까지 출력
		int i = 0;
		int sum = 0;
		
		while(i<10) {
			i++;
			sum += i;
			System.out.println("i=" + i + ", sum=" + sum);			
		}
		// sum 출력은 나와서 실행
		System.out.println();
		System.out.println("합계: " + sum); 

	}

}
