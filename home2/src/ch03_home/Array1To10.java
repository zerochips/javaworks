package ch03_home;

public class Array1To10 {

	public static void main(String[] args) {
		// 1부터 10까지 출력 - 변수 사용
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum += i;
			System.out.print(i+ " ");
		}
		System.out.println();
		System.out.print(sum + " ");
		System.out.println();
		// 1부터 10까지 출력 - 배열 사용
		int[] arr = new int[10];
		int sum1 = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			sum1 += arr[i];
			System.out.printf("%d " , arr[i]);			
		}
		System.out.println();
		System.out.print(sum1 + " ");

	}

}
