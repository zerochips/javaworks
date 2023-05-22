package arrays;

public class Array1To10 {

	public static void main(String[] args) {
		// 1부터 10까지 출력 - 변수 사용
		int sum1 = 0;
		
		for(int i=1; i<=10; i++) {
			sum1 += i;			// 누적 합계
			System.out.print(i + " ");
		}		
		System.out.println("\n합계: " + sum1);		
		
		System.out.println();
		// 1부터 10까지 출력 - 배열 사용
		int[] arr = new int[10];
		
		int arrSum = 0;
		for(int i=0; i<arr.length; i++) {
			arr[i] = i + 1;
			arrSum += arr[i];
			System.out.print(arr[i] + " ");
		}		
		System.out.println("\n배열 합계: "+ arrSum);

	}

}
