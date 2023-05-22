package arrays;

public class ArrayAlphabet {

	public static void main(String[] args) {
		// 1부터 10까지 저장하는 배열
		// nembers를 [배열]이라고도 [객체]라고도 함 - > 힙 메모리에서 작동 
		int[] numbers = new int[10];
		
		
		for(int i = 0; i < numbers.length; i++) {			
			numbers[i] = i + 1;		// 저장과 동시에 출력
//			System.out.print(numbers[i] + " ");
			
		}
		// 알파벳 대문자 - 저장(26개)
		
		char[] alphabets = new char[26];	// 배열
		char ch = 'A';						// 변수
		/*
		alphabets[0] = ch;
		alphabets[1] = (char)(ch + 1);		// 4byte -> 2byte로 작은char형으로 강제 형변환 그래야 계산됨
		
		System.out.println(alphabets[0]);
		System.out.println(alphabets[1]);*/
		
		// 알파벳 26자 저장
		for(int i = 0; i < alphabets.length; i++) {			
			alphabets[i] = ch;
			//ch = (char)(ch + 1);			// 문자를 1개 증가
			ch++;
		}
		
		for(int i = 0; i < alphabets.length; i++) {			
			System.out.println(alphabets[i] + ", " + (int)alphabets[i]);
		}

	}

}
