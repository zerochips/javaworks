package animal;
//내가 추상이면 클래스도 추상으로 설정해줘야함
public abstract class Animal {
	// 필드
	public String kind;	// 동물의 종
	
	public void breathe() {
		System.out.println("동물이 숨을 쉽니다.");
	}
	
	// 추상클래스 - 선언부만 있고 구현부가 없다 - 내가 추상이면 클래스도 추상으로 설정해줘야함
	// 상속 받는 클래스에 반드시 구현해야 함.
	public abstract void sound();
	
	public void showInfo() {
		System.out.println("동물의 종류는 " + kind + "입니다.");
	}

}
