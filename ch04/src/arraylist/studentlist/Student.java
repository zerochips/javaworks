package arraylist.studentlist;

// ArrayList<Subject>
import java.util.ArrayList;
// ArrayList<Subject>
import arraylist.scorelist.Subject;

public class Student {
	// field 필드(멤버 변수)
	int studentId;		// 학번
	String studentName;	// 이름
	ArrayList<Subject> subjectList;
	
	// 생성자 - 232page
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		subjectList = new ArrayList<>();
	}
	
	// subject객체를 new해서  subjectList; 에 자료를 만들어서 넣어주면 됩니다.
	// 과목 추가
	public void addSubject(String name, int score) {
		Subject subject = new Subject();	// 과목 객체 생성
		// set() - 여기서 내용을 써줘야죠!
		subject.setSubjectName(name);		// 과목이름 입력
		subject.setScorePoint(score);		// 점수 입력
		
		subjectList.add(subject);			// 객체를 어레이리스트에 저장
	}
	
	// 학생 정보 출력
	public void showInfo() {
		// 학생을 여러명 만들거고, 과목도 여러개 만들거고
		// for문을 사용할게요
		int total = 0;		
		double avg;
		
		for(int i =0; i<subjectList.size(); i++) {
			Subject subject = subjectList.get(i);
			// 총점 계산
			total += subject.getScorePoint();		
			System.out.printf("학생 %s의 %s과목의 성적은 %d점입니다.\n", 
					studentName, subject.getSubjectName(), subject.getScorePoint());
		}
		//평균 계산
		avg = (double)total / subjectList.size();
		System.out.printf("총점: %d점, 평균: %.2f점", total, avg);
	}
	
	
	
		
}
