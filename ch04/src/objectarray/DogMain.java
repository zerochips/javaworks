package objectarray;

public class DogMain {

	public static void main(String[] args) {
		// 강아지 3마리 생성하기 - 배열 공간 생성
		Dog[] dogArray = new Dog[3];
		// 위에서 3개를 생성했지만
		// 한 번 더 생성을 해야 오류 없이 출력가능함.
		//dogArray[0] = new Dog();
		// 객체를 생성하는 겁니다.
		for(int i=0; i < dogArray.length; i++) {
			dogArray[i] = new Dog();
		}
		
		dogArray[0].setDogName("백구");
		dogArray[0].setType("진돗개");	
		
		
		System.out.println(dogArray[0].getDogName());
		System.out.println(dogArray[0].getType());
		

	}

}
