package chapter04;

public class Test4_2 {

	public static void main(String[] args) {
		//160page ~
		// 확인3
		while(true) {
			int dice1 = (int)(Math.random()*6) +1;
			int dice2 = (int)(Math.random()*6) +1;
			System.out.println(dice1 + dice2);
			if((dice1 + dice2) == 5 );
			break;
		}
		
		// 확인4		
		for(int x=1; x<=10; x++) {
			for(int y=1; y <10; y++) {
				if((4*x+5*y)==60) {
					//System.out.println(x, y);
				}
			}
		}
		
		// 확인5
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 확인6 - 방법1
		for(int i=0; i<5; i++) {
			for(int j=0; j<4-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 확인6 - 방법2 4행 4열
		for(int i=0; i<5; i++) {
			for(int j=4; j>=0; j--) {
				if(i<j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}				
			}
			System.out.println();
		}
		
		int sum = 0;
		
		for(int i = 1; i <= 100; i++ ) {
			sum += i;
		}
		System.out.println(sum);
		
	}

}
