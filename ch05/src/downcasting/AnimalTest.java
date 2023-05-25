package downcasting;

class Animal{
	public void breathe() {
		System.out.println("동물이 숨을 쉽니다.");
	}
}

class Human extends Animal{
	public void breathe() {
		System.out.println("사람이 숨을 쉽니다.");
	}
	
	public void read() {
		System.out.println("사람이 책을 읽습니다.");
	}
}


public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
