package singleton.card;

public class CardTest {

	public static void main(String[] args) {
		// 카드 3개 발급
		// CardCompany 클래스에 getInstance() 메서드를 가져오는거겠지?
		CardCompany company = CardCompany.getInstance();
		
		// company는 현클래스에서 만든 변수, 
		// createCard()는 CardCompany 클래스에서 가져온다
		Card myCard1 = company.createCard();
		Card myCard2 = company.createCard();
		Card myCard3 = company.createCard();
		
		// myCard1 은 현클래스에서 getCardNum()은 Card클래스에서 get으로 정의한 함수
		System.out.println("카드: " + myCard1.getCardNum());
		System.out.println("카드: " + myCard2.getCardNum());
		System.out.println("카드: " + myCard3.getCardNum());

	}

}
// 279page 참고