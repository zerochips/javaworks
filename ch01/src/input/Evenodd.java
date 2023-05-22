package input;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		// 짝수/홀수 판별 프로그램
		// 프로그램 실행시 오류 나는것을 예외(Exception)라고 한다
		// try ~ catch
		try {
			Scanner scan = new Scanner(System.in);
			
			System.out.print("숫자 입력: ");
			int odd = scan.nextInt();    // 키보드에서 숫자 입력
			
			// String 짝홀 = (odd % 2 == 0) ? "짝수" : "홀수";
			String 짝홀 = "";
			// ----------------
			if(odd % 2 == 0) {
				짝홀 = "짝수";
			}else{
				짝홀 = "홀수";
			}
			System.out.print(짝홀);
			
			scan.close();
			
		}catch(Exception e){
			System.out.println("숫자를 입력해주세요");
		}

	}

}
