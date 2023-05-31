package interfaceex.remocon;

public interface RemoteControl {
	// 인터페이스 상수
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//추상 메서드(abstract method) - 생성이 안되니까 생성자가 없죠~
	public void turnOn();
	
	public void turnOff();
	
	public void setVolume(int volume);
	
	// 디폴트 메서드(실체 메서드) - 무음 처리/해제
	default void setMute(boolean mute) {
		if(mute) { // mute == true
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	// 정적 메서드도 사용 가능
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
			
}
