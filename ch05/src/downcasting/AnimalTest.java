package downcasting;

import java.util.ArrayList;

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

class Tiger extends Animal{
	public void breathe() {
		System.out.println("호랑이가 숨을 쉽니다.");
	}
	public void hunt() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal{
	public void breathe() {
		System.out.println("독수리가 숨을 쉽니다.");
	}
	public void fly() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	
}

public class AnimalTest {
	// animal 객체를 담을 어레이리스트 공간 생성
	static ArrayList<Animal> animalList = new ArrayList<>();
	
	public static void main(String[] args) {		
		
		animalList.add(new Human());	// 0번
		animalList.add(new Tiger());	// 1번
		animalList.add(new Eagle());	// 2번
		
		// 함수를 만들어서 하겠습니다.
		System.out.println("*** 타입 변환 ***");
		testCasting();
		
		
		
		
		/*
		//Human 객체를 생성
		Animal human = new Human();
		
		//생성된 객체를 arrayList에 저
		animalList.add(human);		
		animalList.get(0).breathe();
		*/
		
		/*
		// 부모 타입으로 자동 형변환을 구현
		Animal animal = new Human();
		animal.breathe();
		
		// 다운캐스팅으로 강제 형변환 발생
		
		if(animal instanceof Human) {	// animal이 Human의 인스턴스라면
			Human man = (Human)animal;	// 강제 형변환
			man.read();	//read()를 사용함
		}
		*/
		
	}//main 끝
	
	public static void testCasting() {
		for(int i =0; i<animalList.size(); i++) {
			// 다형성 - 부모타입으로 객체형성 했어요			
			Animal animal = animalList.get(i);
			animal.breathe();		// 동일함
			
			//하위 클래스의 메서드 사용
			if(animal instanceof Human) {
				Human human = (Human)animal;	// 자식객체 = (자식클래스)부모객체
				human.read();				
			}else if(animal instanceof Tiger) {	// animal이 Tiger의 인스턴스라면
				Tiger tiger = (Tiger)animal;
				tiger.hunt();
			}else if(animal instanceof Eagle) {	// animal이 Tiger의 인스턴스라면
				Eagle eagle = (Eagle)animal;
				eagle.fly();
			}else {
				System.out.println("지원하지 않는 타입입니다.");
			}
		}
	}
	
	
	
}

