package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTime1 {

	public static void main(String[] args) {		
		// 날짜
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		// 시간
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		// LocalDate - 날짜, LocalTime-시간, LocalDateTime- 날짜와 시간
		// 날짜와 시간
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		// 날짜와 시간 형식 - DatetimeFormatter
		DateTimeFormatter datetime = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss a");	// a가 hh:mm:ss 앞에가면 앞에 출력 a가 hh:mm:ss 뒤에가면 뒤에 출력 
		String current_time = now.format(datetime);
		System.out.println(current_time);
		

	}

}
