package animal;

public class Dog extends Animal{
	public Dog() {
		this.kind = "포유류";
	}	
	
	@Override	// 재정의
	public void sound() {
		System.out.println("멍멍~");		
	}	
}
