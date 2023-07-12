package collections.Box1;

// 제네릭(Generic) 클래스 생성(정의)
public class Box<T> {
	
	private T type;
	
	// private니까 당연이 setter, getter으로 가야겠죠 
	// set은 나갈게 없으니까 void죠
	// get은 나갈게 있으니까 return이구요
	public void set(T type) {
		this.type = type;
	}	
	
	public T get() {
		return type;
	}
	
	
	
	
	
	
	
}
