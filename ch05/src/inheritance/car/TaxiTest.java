package inheritance.car;

class Taxi extends Car{
	int passengerCount;		// 승객수
	
	Taxi(String brand, int cc, int passengerCount){
		super(brand, cc);	// 부모 필드 상속
		this.passengerCount = passengerCount;
	}
	
	@Override //재정의(오버라이드)
	String carInfo() {
		return super.carInfo() +
				", 승객수: " + passengerCount;
	}
}
