package interfaceex.remocon;

public class RemoteControlTest {

	public static void main(String[] args) {		
		// 부모 타입으로 형 변환
		RemoteControl rcTV = new Television();
		RemoteControl rcAudio = new Audio();
		
		rcTV.turnOn();
		rcTV.setVolume(11);		// 최대 볼륨 10이기 때문에 11이라도 10으로 처리됨
		rcTV.setMute(true);		// 무음 처리
		rcTV.setMute(false);	// 무음 해제
		// 정적메서드는 인터페이스 이름으로 직접 접근 - changeBattery 는 RemoteControl 에 static 으로 표현되어있음.
		RemoteControl.changeBattery();	 
		rcTV.turnOff();
		
		System.out.println("====================");
		
		rcAudio.turnOn();
		rcAudio.setVolume(5);
		rcAudio.setVolume(-3);
		rcAudio.setMute(true);
		rcAudio.setMute(false);
		RemoteControl.changeBattery();
		rcAudio.turnOff();
	}
}
