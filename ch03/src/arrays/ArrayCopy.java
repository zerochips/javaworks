package arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		// 배열의 복사
		// 1. 기존 배열과 자료형 및 배열 크기가 똑같은 배열을 새로 만들때
		// 2. 배열의 모든 요소에 자료가 꽉 차서 더 큰 배열을 만들때 사용
		
		//int[] arr1 = {10, 20, 30, 40, 50};
		int[] arr1 = new int[] {10, 20, 30, 40, 50};
		int[] arr2 = new int[5];
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		for(int i=0; i<arr2.length; i++) {
			// 복사를 하겠습니다. 그냥 이렇게하면 돼요
			arr2[i] = arr1[i];	// arr1을 arr2에 복사하는 첫번째 방법
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		//2. 기본적으로 제공되는 clone() 메서드 사용 - arr1을 arr2에 복사하는 두번째 방법
		int[] arr3 = new int[5];
		arr3 = arr1.clone();
		
		for(int i : arr3)
			System.out.print(i + " ");
		
		System.out.println();
		//3. System 클래스의 arraycopy() 메서드
		int[] arr4 = new int[5];
		//arraycopy(원본배열, 배열의 인덱스, 사본배열, 배열의 인덱스, 배열의 크기)
		System.arraycopy(arr1, 0, arr4, 0, 5);	// 0번 인덱스부터 5번인덱스까자ㅣ
		
		for(int i : arr4)
			System.out.print(i + " ");

	}

}
