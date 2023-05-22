package ch03_home;

public class ArrayAlphabet {

	public static void main(String[] args) {
		// 1부터 10까지 저장하는 배열
		int[] num = new int[10];
		
		for(int i=0; i <10; i++) {
			num[i] = i + 1;
			System.out.print("숫자: " + num[i]+ ", ");
		}
		
		// 알파벳 대문자 - 저장(26개)		
		char[] alphabet = new char[26];
		char num1 = 'A';
		
		for(int i = 0; i<alphabet.length; i++) {			
			alphabet[i] = num1;
//			alphabet[1] = 'A';			
			num1++;	
		}
		
		for(int i =0; i < alphabet.length; i++) {
			System.out.print(alphabet[i]);			
			System.out.println("위치: " + i + ", " + "알파벳: " + alphabet[i]);
		}

	}

}
