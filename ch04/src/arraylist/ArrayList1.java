package arraylist;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		// 기본 10개의 저장 공간이 생성
		//ArrayList<Integer> cartList = new ArrayList<>();  // cartList.add(10);
		ArrayList<String> cartList = new ArrayList<>();
		
		// 자료 저장 - add() 함수 사용
		cartList.add("계란");
		cartList.add("콩나물");
		cartList.add("커피");
		
		// 특정 1개 요소 가져오기(검색) - get() 함수 사용
		System.out.println(cartList.get(0));
		System.out.println(cartList.get(1));
		
		// cartList 의 크기 - size() 함수 사용
		System.out.println(cartList.size() + "개" + "\n");
		
		// 전체 요소 출력(검색) for
		for(int i = 0; i< cartList.size(); i++) {	// 리스트를 순회하면서
			String cart = cartList.get(i);			// 요소를 가져와서 cart 변수에 할당해서
			System.out.println(cart);				// 요소를 출력함
		}
		System.out.println("============");
		
		// 요소 수정 - set()
		cartList.set(0, "라면");
		
		// 요소 삭제 - remove() - 인덱스, 요소 두가지 방법으로 삭제가 가능함.
		// cartList.remove(1);
		// cartList.remove("콩나물");		
		cartList.remove("양파");	// 인덱스 사용하지 말고 직접 객체 입력
		// contains() - 객체를 포함하다. 인덱스가 없으면 예외 발생되므로
		// contains()를 사용 권장.
		// 인덱스 번호를 삭제할 경우
//		if(cartList.contains(cartList.get(2))) {
//			cartList.remove(2);
//			}
		
		// 요소를 직접 입력해서 삭제해도 됨
		if(cartList.contains("콩나물")) {
			cartList.remove("콩나물");
		}
		
		
		// 향상 for문
		for(String cart : cartList) {
			System.out.println(cart);
		}
		
		

	}

}

//String[] cart = new String[10]
// cart[0] = "계란"
// cart[1] = "생수"
// ArrayList<String> cartlist = new ArrayList<>();
// cartlist.add("계란")
