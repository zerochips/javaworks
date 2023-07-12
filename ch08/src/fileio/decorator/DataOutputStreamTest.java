package fileio.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamTest {

	public static void main(String[] args) {
		// 기반 스트림 - FileOutputStream
		// 보조 스트림 - DataOutputStream
		try(FileOutputStream fos = new FileOutputStream("file1.txt");
			DataOutputStream dos = new DataOutputStream(fos)){
			// 얘네가 상태로 저장하는 거잖아요
			dos.writeByte(65); 		// 아스키코드
			dos.writeChar(65); 		//
			dos.writeInt(65);		// 정수
			dos.writeFloat(2.5F);	// 실수
			dos.writeUTF("감사합니다."); //문자열
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("수행 완료!");
		
		// 파일을 나눠도 되고 지금처럼 합쳐도 괜찮음.
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
/* 
파일입출력 - 스트림
기반스트림
보조스트림 - 단독 쓸수 없고, 기반스트림을

DataOutputStream - 0과 1을 저장한다
DataInputStream - 


*/
 