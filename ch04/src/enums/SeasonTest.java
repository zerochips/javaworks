package enums;

public class SeasonTest {

	public static void main(String[] args) {
		// null로 초기화를 해줍니다. 객체니까~
		//Season season = null;
		Season season = Season.겨울;
		
		//switch ~ case문을 사용해볼게요.
		switch(season) {
		case 봄:
			season = Season.봄;
			break;
		case 여름:
			season = Season.여름;
			break;
		case 가을:
			season = Season.가을;
			break;
		case 겨울:
			season = Season.겨울;
			break;
			
		}
		System.out.println("현재 계절은 " + season + "입니다.");  // 여름 나오죠~
		
		if(season == Season.여름 || season == Season.봄) {
			System.out.println("무더위와 장마가 많습니다.");
		}else {
			System.out.println("무더위와 장마가 많지 않습니다..");
		}
	}

}
