package twodimention;

public class TwoDimension3 {

	public static void main(String[] args) {
		// 문자형 2차원 배열
		// 알파벳 26개
		char[][] alphabets = new char[13][2];
		char ch = 'A';
		
		//알파벳 저장
		for(int i = 0; i < alphabets.length; i++) {
			for(int j =0; j < alphabets[i].length; j++) {
				alphabets[i][j] = ch;				
				ch++;
				//ch = (char)(ch + 1);	// int형을 낮춰야 되니까 char로 형변환
				System.out.print(alphabets[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		//알파벳 출력
		for(int i = 0; i<alphabets.length; i++) {
			for(int j =0; j < alphabets[i].length; j++) {
				System.out.print(alphabets[i][j] + " ");
				//System.out.printf(" alphabets[i][j]+", + alphabets[i][j]);
			}
			System.out.println();
		}

	}

}
