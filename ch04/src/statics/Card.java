package statics;

public class Card {
	static int serialNum = 100; //값을 계속 공유할 수 있게
	int cardNum; 	// 카드번호 // 멤버변수죠~
	
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
