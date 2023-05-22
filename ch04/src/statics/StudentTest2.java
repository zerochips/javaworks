package statics;

public class StudentTest2 {

	public static void main(String[] args) {
		// 학번 자동 부여
		// 학번을 확인해볼게요
		// 이객체는 스택변순데
		Student kim = new Student();
		Student han = new Student();
		Student kang = new Student();
		
		
		System.out.println("학번: " + kim.getStudentId());
		System.out.println("학번: " + han.getStudentId());
		System.out.println("학번: " + kang.getStudentId());
		
	}

}
