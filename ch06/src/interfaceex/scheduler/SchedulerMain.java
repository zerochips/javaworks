package interfaceex.scheduler;

import java.io.IOException;

public class SchedulerMain {
	
	// 예외처리 - int ch = System.in.read(); - add throws
	public static void main(String[] args) throws IOException {		 
		// 입력 방식 - System.in.read()
		System.out.println("전화 상담 배분 방식을 선택하세요.");
		System.out.println("R: 한명씩 차례로 배분");
		System.out.println("L: 현재 상담 업무가 없거나 대기가 가장 적은 상담원에게 배분");
		System.out.println("P: 우선 순위가 높은 고객 먼저 할당");
		
		int ch = System.in.read();  //할당 방식을 입력받아 ch에 대입 // read() 반환값이 int형이므로 char 쓰지 않음 
		Scheduler scheduler = null;	//객체 생성시 다형성 활용
		
		if(ch == 'R' || ch == 'r') {		// 입력받은 값이 'R' 이나 'r'이면
			scheduler = new RoundRobin();	// 다형성 생성
		}else if(ch == 'L' || ch =='l') {
			scheduler = new LeastJob();
		}else if(ch =='P' || ch == 'p') {
			scheduler = new PriorityAllocation();
		}else {
			System.out.println("지원되지 않는 기능입니다.");
			return; // 즉시 종료
		}
		
		// 중복을 줄이는 효과
		scheduler.getNextCall();		// 입력 받은 정책의 메서드 호출
		scheduler.sendCallToAgent();
	}

}

////객체 생성시 다형성 활용 - 여기 아래부분 다 삭제됨 - 중복을 줄였기 때문에 코드 간결화가 가능함
//Scheduler scheduler1 = new RoundRobin();
//Scheduler scheduler2 = new LeastJob();
//
//scheduler1.getNextCall();
//scheduler1.sendCallToAgent();
