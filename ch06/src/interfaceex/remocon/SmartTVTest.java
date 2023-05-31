package interfaceex.remocon;

public class SmartTVTest {

	public static void main(String[] args) {
		
		// SmartTV 객체 생성
		SmartTV stv = new SmartTV();
		//SmartTV
		stv.turnOn();
		stv.serarch("www.google.com");
		stv.setVolume(8);
		RemoteControl.changeBattery();	//정적메서드는 인터페이스 이름으로 직접 접근합니다.
		stv.turnOff();
		
		System.out.println("========================");
		// stv RemoteControl 인터페이스로 들어감
		// 부모형으로 형변환 검색
		RemoteControl rc = stv;
		Searchable searchable = stv;
		
		rc.turnOn();
		searchable.serarch("www.naver.com");
		RemoteControl.changeBattery();	//정적메서드는 인터페이스 이름으로 직접 접근합니다.
		rc.turnOff();
		
		
		
	}

}
