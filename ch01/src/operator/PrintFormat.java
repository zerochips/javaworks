package operator;

public class PrintFormat {

	public static void main(String[] args) {
		// printf("문자열 포멧", 객체)
		// 서식 문자 - %d : 정수, %f - 실수, %s - 문자열
		// 이스케이프 문자 - \n : 줄바꿈, \t: 탭
		
		/* ******* [int - %d] ******* */
		int year = 2022;
		System.out.println("올해는 " + year + "년 입니다.");
		System.out.printf("올해는 %d년 입니다.", year);
		System.out.println("\n------------------------");
		
		/* ******* [String - %s] ******* */
		String nick = "얼음 공주";
		System.out.printf("그녀의 별명은 %s입니다.", nick);
		System.out.println();
		
		/* ******* [table] ******* */
		String table = "";
		table += "------------------------\n";
		table += "이름\t나이\t나라\n";
		table += "------------------------\n";
		table += "강감찬\t82\t고려\n";
		table += "이순신\t53\t조선\n";
		table += "------------------------\n";
		
		System.out.println(table);
		
	}

}

/*
main 을 치고 ctrl + space bar를 치면 public static void main(String[] args) { 나타남
 
 
 
 */
