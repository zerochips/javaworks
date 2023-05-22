package home1;

public class Integer1 {

	public static void main(String[] args) {
		// 문자형을 숫자로 변환
		System.out.println("10");
		System.out.println("10" + "11");
		System.out.println(10 + 11);
		
		System.out.println();
		// 문자 "10" 숫자를 Integer.parseInt를 사용해 정수로 변환
		int ten = Integer.parseInt("10");
		int one = Integer.parseInt("7");
		System.out.println("정수: " + ten + one);
		
		double ten2 = Double.parseDouble("10.25");
		double one2 = Double.parseDouble("11.3");
		System.out.printf("실수1: %.2f\n", ten2 + one2);
		
		float num1 = Float.parseFloat("7.45");
		float num2 = Float.parseFloat("3.75");
		System.out.print("실수2: " + (num1 + num2));			
		
	}

}
