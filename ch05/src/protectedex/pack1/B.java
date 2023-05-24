package protectedex.pack1;

public class B {
	
	//여기에 메서드가 하나 있다
	public void method() {
		// 같은 패키지에서는 protected 접근제한자가 허용됨
		A a = new A();
		a.filed = "ok";
		a.method();
	}

}
