package interfaceex.remocon;

public interface RemoteControl {
	// 상수
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//추상 메서드 - 생성이 안되니까 생성자가 없죠~
	public void turnOn();
	
	public void turnOff();
	
	public void setVolume(int volume);
			
}
