package inheritance.person;

// [ extends ] 를 쓰는 순간 Person의 name 과 age 를 불러오는 겁니다. 사용이 가능하다는 말입니다.
// 상속이 된거 eng에 .을 찍으면 뒤에 age나 name이 보이죠
// Person 클래스 상속함
public class Engineer extends Person{
	// 필드
	int companyId;
	
	public static void main(String[] args) {
		Engineer eng = new Engineer();
		
		eng.name = "봉구";		// 부모 필드에 접근 // 이렇게 직접적으로 가는건 안좋은 겁니다. // 설명을하기 위해서 직접 불러와본겁니다. // 참고만하세요
		eng.age = 27;
		eng.companyId = 256;
	}
}
