package inheritance.shop;

public class ShopMain {

	public static void main(String[] args) {
		// Shop1의 객체 생성
		Shop1 shop1  = new Shop1();
		
		// 현
		shop1.sellDoenjangJJige();
		shop1.sellKimchiJJige();
		shop1.sellBibimBap();
		
		System.out.println("====================");
				
		// 부모 클래스의 타입으로 객체 생성
		// 앞으로는 이렇게 사용할겁니다.
		// 나중에는 다형성으로 이어집니다.
		// 다형성으로 연결
		// HeadShop으로해도 문제가 없다는 겁니다~
		HeadShop shop2 = new Shop2();
		shop2.sellDoenjangJJige();
		shop2.sellKimchiJJige();
		shop2.sellBibimBap();
		
		// 형변환
		// 왼쪽이 더 크면 자동형변환이 되기 때문에 아무 문제가 없어요~
		int iNum = 10;
		float fNum = iNum;			// 자동 형변환
		System.out.println(fNum);	// 10.0
		
		// 클래스에서 조금 있으면 그런상황이 발생할겁니다.
		// 다음 예제를 통해서 ~ 블라블라
		iNum = (int)fNum;			// 강제 형변환
		System.out.println(iNum);	// 10

	}

}
