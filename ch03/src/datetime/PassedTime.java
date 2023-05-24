package datetime;

import java.util.Calendar;

public class PassedTime {

	public static void main(String[] args) {
		Calendar theDay = Calendar.getInstance();	// 시작일
		Calendar today = Calendar.getInstance();	// 오늘 객체 생성(종료일)
				
//		System.out.println(today);
//		System.out.println(today);
//		
//		today.get(Calendar.YEAR);
//		System.out.println(today.get(Calendar.YEAR)); // 2023
//		
//		today.get(Calendar.MONTH);	// 출력란에 기입, 지금처럼 따로 뺄 필요없음. // 불러오는 방식 이해하라고 분리해보았음
//		System.out.println(today.get(Calendar.MONTH) + 1);
//		
//		System.out.println(today.getTimeInMillis());
//		
//		// 년 환산
//		System.out.println(today.getTimeInMillis() / (24*60*60*1000) / 365); //  /시간/분/초
//		
//		// 일로 환산
//		System.out.println(today.getTimeInMillis() / (24*60*60*1000));
		
		// 시작일과 종료일 지정
		theDay.set(2023, 3,16);		//시작일 지정
		today.set(2023, 5, 24);		//종료일(오늘) 지정
		
		// 날짜 출력
		// "년" 문자 형변환 해주면 빨간라인 사라짐. 변환됐기 때문에
//		String startDay = theDay.get(Calendar.YEAR) + "년 " +
//			theDay.get(Calendar.MONTH) + "월 " + today.get(Calendar.DATE) + "일";
//		String today1 = today.get(Calendar.YEAR) + "년 " +
//				today.get(Calendar.MONTH) + "월 " + today.get(Calendar.DATE) + "일";
//		System.out.println(startDay);
//		System.out.println(today1);
		
		
		// 날짜 출력 메서드
		// 여기를 출력해야죠 ↓↓
		datePrint(theDay);	// 시작일 출력
		datePrint(today);	// 종료일 출력
		System.out.println(datePrint(theDay));
		System.out.println(datePrint(today));
		
		System.out.println();
		
		// 지나온 시간 계산 : 종료일 - 시작일
		long passedTime = today.getTimeInMillis() - theDay.getTimeInMillis();
		System.out.println(passedTime + "밀리초");
		
		passedTime = passedTime / (24*60*60*1000);
		System.out.println("개강 이후 " + passedTime + "일이 지났습니다.");
	}//main 끝
	
	
	// 날짜 출력 메서드
	public static String datePrint(Calendar date) {		// 날짜 객체를 매개로 전달받아
		String srtDate = date.get(Calendar.YEAR) + "년 " +
				date.get(Calendar.MONTH) + "월 " + date.get(Calendar.DATE) + "일";
		return srtDate;		// 날짜 문자열을 반환(돌려줌)
	}
	
//	public static void String datePrint(Calendar date) {		// 날짜 객체를 매개로 전달받아
//		String srtDate = date.get(Calendar.YEAR) + "년 " +
//				date.get(Calendar.MONTH) + "월 " + date.get(Calendar.DATE) + "일";
//		System.out.println(srtDate);			// 여기 다시 확인해봐야함 - 무조건 틀렸을 가능성이 아주 큼!!!!!!!!!!!!!!!!!!!!!!!!
//		//return srtDate;		// 날짜 문자열을 반환(돌려줌)
//	}
	
	

}
