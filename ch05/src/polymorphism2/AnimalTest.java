package polymorphism2;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

// Human 클래스
class Human extends Animal{
	public void move() {
		System.out.println("사람이 움직입니다.");
	}
}

// Tiger 클래스
class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 움직입니다.");
	}
}

// Eagle 클래스
class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 움직입니다.");
	}
}


public class AnimalTest {

	public static void main(String[] args) {
		// AnimalTest의 객체 생성
		// new를 사용하면
		AnimalTest aTest = new AnimalTest();

		Animal human = new Human();
		Animal tiger = new Tiger();
		Animal eagle = new Eagle();
		
		// moveAnimal() 호출
		// moveAnimal(human) 앞에 aTest. 붙여줍니다.
		aTest.moveAnimal(human);
		aTest.moveAnimal(tiger);
		aTest.moveAnimal(eagle);
	}
	
	// static을 빼야합니다.
	// move() 를 사용할 메서드 생성 - 매개변수의 다형성
	public void moveAnimal(Animal animal) {
		animal.move();
	}

}
