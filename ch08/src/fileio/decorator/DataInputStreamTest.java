package fileio.decorator;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamTest {

	public static void main(String[] args) {
		// 순서와 갯수가 중요
		// 기반스트림 - FileInputStream
		// 보조스트림 - DataInputStream
		try(FileInputStream fis = new FileInputStream("file1.txt");
			DataInputStream dis = new DataInputStream(fis) ){	// 읽은 때 dis로 읽어야하죠~
			//System.out.println(dis.readInt()); //dis로 읽습니다. 얘로 출력을 해보겠습니다. 출력값 65
			System.out.println(dis.readByte());  // 출력값 0 
			System.out.println(dis.readChar()); // 아무것도 안뜸
			System.out.println(dis.readInt());		// dis.readInt()와
			System.out.println(dis.readFloat());	// dis.readFloat()을 같이 살려놔야 정상적으로 출력됨
			System.out.println(dis.readUTF());
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}

