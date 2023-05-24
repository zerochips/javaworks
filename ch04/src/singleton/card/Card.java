package singleton.card;

public class Card {
	static int serialNum = 100; //값을 계속 공유할 수 있게 // static을 넣으면 정적변수, static 변수라고 말합니다. 값을 누적하고 공유하고 있기 때문에 계속 증가하는거죠 
	int cardNum; 	// 카드번호 // 멤버변수죠~
	// 여기가 생성자잖아요↓
	Card(){
		serialNum++;
		cardNum = serialNum;
	}
	
	// 카드 번호를 가져오는 함수 정의
	// ************ ↓[ get() ]↓ ************
	int getCardNum() {
		return cardNum;
	}
	
	// ************ ↓[ set() ]↓ ************
	void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}

}

// static 패키지에서 복사해온 클래스입니다
