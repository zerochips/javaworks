package shelf;

public interface Queue {	// 함수만 봐도 구현할게 생각이 되어야 합니다.
	
	// 자료구조 - 선입선출 FIFO 방식 - 기억안나면 버스를 생각해보자~
	void enQueue(String title);	// 리스트의 맨 마지막에 추가 - 뒤에서 추가되죠~ 얘가 책을 넣으면
	
	String deQueue();	// 리스트의 맨 처음 항목 변환(0번 인텍스-책제목) //여기서 0번 인덱스부터 나와야하죠
	
	int getSize();	// 현재 Queue에 있는 개수 - 얘는 숫자로 // Queue자료형

}
