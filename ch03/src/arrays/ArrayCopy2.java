package arrays;

public class ArrayCopy2 {

	public static void main(String[] args) {
		// char형 1차원 배열 arr1에 N, E, T 저장
		char[] arr1 = {'N', 'E', 'T'};
		char[] arr2 = new char[3];
		char[] arr3 = new char[3];
		
		//배열 복사
		for(int i =0; i < arr2.length; i++) {
			arr2[i] = arr1[i];
			System.out.print(arr2[i] + " ");
		}
		
		System.out.println();
		//역순 복사 N E T -> T E N
		for(int i=0; i < arr1.length; i++) {
			arr3[i] = arr1[2-i];	// 여기서 설정해줌 arr1[2-i] = 2 이기 때문에 2번째 배열에 있는 수를 arr3[i] 0번째 배열에 위치다
			System.out.print(arr3[i] + " ");
		}
		System.out.println();
		
		//역순 복사 N E T -> T E N
		// -1은 마지막 인덱스에 위치한 값부터 라는 말! 		
		for(int i = arr1.length -1; i>=0; i--) {
			arr3[i] = arr1[i];	// 여기서 설정해줌 arr1[2-i] = 2 이기 때문에 2번째 배열에 있는 수를 arr3[i] 0번째 배열에 위치다
			System.out.print(arr3[i] + " ");
		}
		System.out.println();
		
		//역순 복사 N E T -> T E N
//		for(int i=0; i < arr1.length; i++) {
//			arr3[2-i] = arr1[i];	// 여기서 설정해줌
//		}
		
		/*
		 * i=0 	arr3[2]=arr1[0]     N 출력 arr3[0]='' (출력안됨)
		 * 		arr3[1]=arr1[1]   E N 출력 arr3[1]=E
		 * 		arr3[2]=arr1[2] T E N 출력 arr3[2]=T 
		 * */
		
		for(int i=0; i<arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}		
		
	}

}
