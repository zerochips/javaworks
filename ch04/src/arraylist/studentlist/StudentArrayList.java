package arraylist.studentlist;

public class StudentArrayList {

	public static void main(String[] args) {
		// 학생 객체 생성 
		Student s1 = new Student(1001, "이양파");
		
		// 
		s1.addSubject("국어", 90);
		s1.addSubject("수학", 80);
		s1.addSubject("과학", 75);	// 없는 다른 과목도 유연하게 삽입할 수 있다.
				
		s1.showInfo();
		
		

	}

}
