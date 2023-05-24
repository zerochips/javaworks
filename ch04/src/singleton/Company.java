package singleton;

public class Company {
	// singleton 패턴으로 만들어 보도록 하겠습니다.
	// 자기가 자기를 new를 만들었죠
	// instance를 이미? 미리 만들어 버렸죠
	// 유일하게 생성한 인스턴스(Company 클래스의 객체다)
	// 그냥 이렇게 패턴을 만드는 겁니다.
	// private static Company instance= new Company(); if문 아래로 들어갔습니다.
	// 싱글톤 패턴으로 작성
	private static Company instance;	// 이걸 필드라고 하는데 객체 변수
	
	// 기본생성자죠 매게변수가 없으니까 
	private Company() {}
	
	
	// 인스턴스를 사용할 수 있게 함수를 만들어줘야죠
	// 인스턴스에 접근할(사용할) 메서드 생성
	// 이건 public 입니다. private 하면 안됩니다.
	public static Company getInstance() {
		// 여기서 조건문을 넣어서
		if(instance == null) {
			instance= new Company();
		}
		return instance;
	}	
	// 출력해보면 싱글톤(instance)인지 확인이 가능합니다.
	// 계속 동일하게 출력됩니다.
	// null일 때만 만들어진다고 
	
	
}
