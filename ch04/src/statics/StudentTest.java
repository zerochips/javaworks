package statics;

public class StudentTest {

	public static void main(String[] args) {
		// 학생 객체 생성(lee - 힙 메모리영역 위치)		
		// 메인에 직접 접근하지X 말고 함수를 만들어서 접근하라고 했죠
		// 함수 만드는 방식 get과 set을 사용하라고 했죠
		// Student class로 이동해서 만드세요.
		Student lee = new Student();
		
		// lee.name = "이대한";
		// 함수를 호출했는데 정보가 오잖아요
		// Student class로 이동해서 만드세요.
		// 다른 클래스에서 private이 붙은 변수는 접근할 수 없음
//		lee.setStudentId = 1001);
//		lee.setName = "이대한");
		
		lee.setStudentID(1001);
		lee.setName("이대한");
		
		System.out.println("학번: " + lee.getStudentId());
		System.out.println("이름: " + lee.getName());
		
		
	}

}
