package enums;

// 분리해서 만들어도 되지만 지금처럼 위에 직접 만들어서 사용해도 됩니다.
enum Level{
	LOW,
	MEDIUM,
	HIGH
}

enum Food{
	햄버거,
	삼겹살,
	치킨
}

public class EnumLevel {

	public static void main(String[] args) {
		Level level = Level.HIGH;
		
		switch(level) {
		case LOW:
			System.out.println("Low level");
			break;
		case MEDIUM:
			System.out.println("Medium level");
			break;
		case HIGH:
			System.out.println("High level");
			break;
		default:
			System.out.println("레벨이 없습니다.");
		}
		
		Food food = Food.치킨;

	}

}
