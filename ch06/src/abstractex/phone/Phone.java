package abstractex.phone;

// 추상클래스(상속받는 클래스에게 필드, 메서드의 이름을 통일적으로 사용하도록함)
public abstract class Phone {
	// 필드
	public String owner;	// 주인
	
	// 생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	
	// 메서드
	public void powerOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	public void powerOff() {
		System.out.println("폰 전원을 끕니다.");
	}
	
}
