package statics;

public class Student {
	//메인 넣지말고 자료형으로 쓸겁니다.
	
	// 자 이거 멤버변수죠~
	// 얘를 테스트를 한 번 해볼게요 - 파일을 메인 있는걸로해서 만들어볼게요
	// StudentTest class 만드세요
	static int serialNum = 1000; //기분 번호를 만드는 겁니다.
	
	int studentId;	// 학번
	String name;	// 이름
	
	// ************ [ 생성자 ] ************
	Student(){					// 기본 생성자
		serialNum++;			// serialNum을 1증가
		studentId = serialNum;	// 증가된 번호를 학번에 대입
		
	}		
	
	// ************ ↓[ get() ]↓ ************
	// getName
	String getName() {
		return name;
	}	
	
	// getStudentId
	int getStudentId(){
		return studentId;
	}
	
	// ************ ↓[ set() ]↓ ************
	// setStudentID
	void setStudentID(int studentId) {
		this.studentId = studentId;
	}
	
	// setName
	void setName(String name) {
		this.name = name;
	}
	
}
