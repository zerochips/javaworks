package interfaceex.remocon;

public class SmartTV implements RemoteControl, Searchable{

	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}		
		System.out.println("현재 볼륨은 " + this.volume + "입니다.");	// 이런 경우는 this.volume을 해야 10 이상일 경우 상수로 설정한 값이 정상적으로 출력됨
	}

	@Override
	public void serarch(String url) {
		System.out.println(url + "을 검색합니다.");
		
	}
	
}
