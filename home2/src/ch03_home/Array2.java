package ch03_home;

public class Array2 {

	public static void main(String[] args) {
		// 문자열형 배열 선언 및 사용
		String[] car = {"volvo", "K7", "Sonata", "BMW", "Morning"};
		
		//"Sonata"를 검색하시오
		System.out.println(car[2]);
		
		//BMW를 자가용으로 변경하시오
		car[3] = "자가용";
		
		//전체 출력
		for(int i = 0; i < car.length; i++) {
			System.out.print(car[i] + " ");
		}
		
		System.out.println();
		//향상된 for문
		//for(자료형 변수 : 배열이름){}
		for(String 자가용 : car) {
			System.out.print(자가용+ " ");
		}
		
		
		

	}

}
