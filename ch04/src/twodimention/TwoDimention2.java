package twodimention;

public class TwoDimention2 {

	public static void main(String[] args) {
		// 5행 5열의 2차원 배열 생성
		char[][] a = new char[5][5];	
		
		
//		for(int i =0; i < a.length; i++) {
//			for(int j=0; j<a[i].length; j++) {
//				a[i][j] = '*';
//				System.out.print(a[i][j]+ " ");
//			}
//			System.out.println();
//		}
//		System.out.println();
//		
//		
//		for(int i =0; i < 5; i++) {
//			for(int j=0; j < i + 1; j++) {
//				a[i][j] = '*';
//				System.out.print(a[i][j]+ " ");
//			}
//			System.out.println();
//		}
//		System.out.println();
//		
		// 역삼각형ver1
		for(int i =0; i < a.length; i++) {
			for(int j=i; j < a[i].length; j++) {
				a[i][j] = '*';
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i =0; i < a.length; i++) {
			for(int j=0; j < a[i].length; j++) {
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println();
		
//		// 역삼각형ver2 - 디버깅 이론상 맞음
//		for(int i = 0; i < a.length; i++) {
//			for(int j=0; j < a[i].length-i; j++) {
//				a[i][j] = '*';
//				System.out.print(a[i][j]+ " ");
//			}
//			System.out.println();
//		}
//		System.out.println();
//		
		
		/*
		 i=0 j=0 a[0][0] *
		 		 a[0][1] **
		 		 a[0][2] ***
		 		 a[0][3] ****
		 		 a[0][4] *****(최종)
		 
		 i=1 j=1 a[1][1] *
		 	 j=1 a[1][2] **
		 	 j=1 a[1][3] ***
		 	 j=1 a[1][4] ****(최종)
		 	 
		 i=2 j=2 a[2][2] *
		 	 j=2 a[2][3] **
		 	 j=2 a[2][4] ***(최종)
		 	 
		 i=3 j=3 a[3][3] *
		 	 j=3 a[3][4] **(최종)
		 	 
		 i=4 j=4 a[4][4] *(최종)
		 
		 * 
		 */
		
//		for(char i = 0; i < 5 ; i++) {
//			for(char j = 0; j < 5; j++) {
//				System.out.print("*" + " ");
//			}
//			System.out.println();
//		}
		
		/*
		 * 4행 5열
		 1 2 3 4 5
		 6 7 8 9 10
		 11 12 13 14 15
		 16 17 18 19 20
		 * */
//		int[][] arr = new int[4][5];
//		
//		for(int i =0; i < arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				// 종료값에 1을 더하면 증가하죠
//				
//				// 열의 종료값 x 행의 값 + 열의값 + 1
//				arr[i][j] = arr[i].length * i + j + 1;
//				
//				System.out.print(arr[i][j]+ " ");
//			}
//			System.out.println();
//		}
//		System.out.println();

	}

}
