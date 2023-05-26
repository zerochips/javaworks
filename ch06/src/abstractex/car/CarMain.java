package abstractex.car;

public class CarMain {

	public static void main(String[] args) {
		// 부모 타입으로 bus 객체 생성 - 자동 형변환(부모가 크니까)
		Car car1 = new Bus();
		Car car2 = new Truck();		// 부모 타입으로 truck 객체 생성(자동 형변환)
		
		car1.run();
		car1.refuel();		
		
		// 다운 캐스팅(강제 형변환 - instanceof) // 간편하게 하려면 Car bus = new Bus(); 여기를 Bus bus = new Bus(); 라고하면 돼요
		if(car1 instanceof Bus) {
			Bus bus = (Bus)car1;
			bus.takePassenger();
		}
		System.out.println("*******************");
		
		car2.run();
		car2.refuel();
		
		if(car2 instanceof Truck) {
			Truck truck = (Truck)car2;
			truck.load();
		}
		
	}

}

/*
템플릿 메서드(추상)
final 붙이는 순간 상수가 되면서 더 이상 변경이 되지 않는거죠(변경 안됨) 
final int PI = 3.14
final 이 붙어버리면 더 이상 재정의가 되지 않습니다.
final 메서드(){ x = 1; }
*/
