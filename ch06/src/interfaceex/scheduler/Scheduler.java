package interfaceex.scheduler;


public interface Scheduler {
	// 아래 있는 것들을 만들었으면 구현을 해야겠죠 - RoundRobin 클래스를 만들어볼게요
	//다음 전화 가져오기
	public void getNextCall();
	
	// 상담원에게 전화를 배분하기
	public void sendCallToAgent();	
	
}
