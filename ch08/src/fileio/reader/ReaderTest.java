package fileio.reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderTest {

	public static void main(String[] args) throws IOException {
		//data2.txt 데이터 읽어 오기
		Reader fr = new FileReader("data2.txt");	// fr 여기가 open
		
		/*int data;
		while(true) {
			data = fr.read();	// 코드값으로 저장		// fr 여기가 read
			if(data == -1)		// 읽을 데이터가 없으면
				break;			// 빠져 나옴
				System.out.print((char)data);			
		}	*/	
		fr.close();									// fr 여기가 close 
		
		// 짧게 데이터 읽는 방법
		int data;
		
		while((data = fr.read()) != -1) {
			System.out.print((char)data);
		}
		
		
	}

}
