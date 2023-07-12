package fileio.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTest {

	public static void main(String[] args) {
		// 객체의 직렬화(현재의 상태를 그대로 저장)
		Person son = new Person("손정의", "대표이사");
		Person son2 = new Person("김민정", "대표");
		
		//보조스트림 - OjectOutputStream
		try(FileOutputStream fos = new FileOutputStream("serial.out");
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(son);	//쓰기  // 객체를 쓰기를 한겁니다
			oos.writeObject(son2);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// 역직렬화 - 복원
		try(FileInputStream fis = new FileInputStream("serial.out");
			ObjectInputStream ois = new ObjectInputStream(fis)){			
			Person p1 = (Person)ois.readObject();	// 객체읽기 // 얘를 object로 받기 위해서 Person p1으로 하고요
			System.out.println(p1); 	// 이렇게 출력하면 fileio.serialization.Person@5579bb86 이렇게 나오죠 Person에가서 재정의를 해줍니다. override
			//System.out.println(p1.toString()); 재정의하게되면 System.out.println(p1); 이렇게만 표시해줘도 되죠
			
			Person p2 = (Person)ois.readObject();
			System.out.println(p2);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
