package animal;

public class Cat extends Animal {
	// 상속 받았으니까 사용할 수 있죠
	public Cat() {
		this.kind = "포유류";
	}
	
	// Animal class에 있는 public abstract void sound(); 는
	// sound가 반드시 구현되어야 하잖아요
	
	@Override // 재정의할 때 Override가 나오죠
	public void sound() {
		System.out.println("야옹~");		
	}
	
	
	
		
}
