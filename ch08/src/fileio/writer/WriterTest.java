package fileio.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterTest {

	public static void main(String[] args) throws IOException {
		
		Writer fw = new FileWriter("data.txt");
		
		fw.write("hello~\n");
		fw.write("안녕\n");
		fw.write(66+"\n");	// 정수는 아스키 코드값으로 인식
		fw.write(66+1+"\n");
		//fw.write(2.54);	실수 사용 안됨
		
		char[] buf = {'s', 'm', 'i', 'l', 'e'};
		fw.write(buf);
		fw.write(10); // 출바꿈(개행 문자)
		fw.write(buf, 1, 4);	// 1번 인덱스부터 4개 출력
		
		fw.close();
		
		System.out.println("수행 완료!");
		
	}

}
