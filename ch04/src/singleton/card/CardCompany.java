package singleton.card;

public class CardCompany {
	// 객체 필드(변수)
	private static CardCompany instance;
	
	// 생성자
	private CardCompany() {}
	
	// get() 메서드 - 
	public static CardCompany getInstance() {
		if(instance == null) {
			instance = new CardCompany();
		}
		return instance;
	}
	
	// 카드 생산
	public Card createCard() {
		Card card = new Card();
		return card;
	}		
}
