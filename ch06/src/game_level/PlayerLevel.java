package game_level;

public abstract class PlayerLevel {
	
	// 반환형, 구현부가 없는 추상 메서드
	public abstract void run();	
	public abstract void jump();
	public abstract void turn();	
	public abstract void showLevelMessage();
	
	// 템플릿 메서드(재정의 못함)
	// count 점프할 때 사용하려고 합니다.
	public final void go(int count) {
		run();
		for(int i =0; i<count; i++) {
			jump();
		}		
		turn();
	}
	
	
	
}
