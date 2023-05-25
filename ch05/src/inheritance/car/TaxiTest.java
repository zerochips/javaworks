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
	
	public class TaxiTest{
		// 여기 확인해서 수정해야함
		public void main(String[] args) {
			Taxi taxi = new Taxi("Ionic 5", 3000, 1);
			Taxi 카카오택시 = new Taxi("Sonata", 3000, 1);
			
			System.out.println(taxi.carInfo());
			System.out.println(카카오택시.carInfo());
		}
	}
}
