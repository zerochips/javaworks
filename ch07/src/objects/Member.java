package objects;

public class Member {
	// 필드
	String id;
	
	// 매개변수가 있는 생성자
	Member(String id){
		this.id = id;
	}
	
	
	// equals 재정의 - 
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;	// 다운 캐스팅
			if(id.equals(member.id)) {	//this.id == id.id 도 출력됨
				return true;
			}			
		}
		return false;
	}
	
	
	// hashCode 재정의
	@Override
	public int hashCode() {		
		return id.hashCode();	//반환형이 int형이므로 hashCode() 호출 해야한다 //hashCode() 만 재정의하면 출력이 잘못될 수 있다
	}
	
	
}
