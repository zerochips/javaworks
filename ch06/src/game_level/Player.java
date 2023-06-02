package game_level;

public class Player {
	
	//필드
	private PlayerLevel level;
	
	//생성자 - 초보자 객체가 생성되면서 메시지가 출력됨. Player 객체가 생성되는 순간 무조건 나오게 되어있음.
	public Player() {
		level = new Beginner();
		level.showLevelMessage();	// 초보자 메시지 출력
	}
	
	//showLevelMessage()를 변경하는 메서드(매개변수의 다형성) - setter라고 보면 됨.
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	//play 메서드
	public void play(int count) {
		level.go(count);
	}
}
