package polymorphism;

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

class Dog extends Animal{
	public void move() {
		System.out.println("개가 움직입니다.");
	}
}


public class AnimalTest {

	public static void main(String[] args) {
//		Animal animal = new Animal();
//		animal.move();		
//		Human human = new Human();
//		human.move();		
//		Tiger tiger = new Tiger();
//		tiger.move();
		
		// 부모걸 해버리자~ Animal이 앞에 붙임
		Animal human = new Human();
		Animal tiger = new Tiger();
		Animal eagle = new Eagle();
		Animal dog = new Dog();
		
		moveAnimal(human);
		moveAnimal(tiger);
		moveAnimal(eagle);
		moveAnimal(dog);

	}
	
	// move() 를 사용할 메서드 생성 - 매개변수의 다형성
	public static void moveAnimal(Animal animal) {
		animal.move();
	}

}
