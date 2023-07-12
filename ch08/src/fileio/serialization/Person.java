package fileio.serialization;

import java.io.Serializable;
// 클래스의 직렬화 - 현상태 그대로를 저장하는것
public class Person implements Serializable{
	
	private static final long serialVersionUID = 10L;
	
	// 필드
	String name;
	String job;
	
	// String name과 String job을 외부에서 받을겁니다.
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}

	@Override
	public String toString() {	//객체 정보를 넣어주면 되죠 name, job
		return name + ", " + job;
	}
	
}
/*
직렬화/역직렬화(복원)
serialization 
 

 */