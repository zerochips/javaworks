package inheritance.car;

public class Car {
	// 필드
	String brand;	// 브랜드가 있을거구요
	int cc;			// 배기량이 있을거구요
	
	// 생성자
	Car(String brand, int cc){
		this.brand = brand;
		this.cc = cc;		
	}
	
	// 메서드
	String carInfo() {
		return "브랜드: " + brand + ", 배기량: " + cc;
	}
	
}
