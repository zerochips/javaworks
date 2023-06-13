package fileio.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterTest {

	public static void main(String[] args) throws IOException {
		// 부모형으로 객체 생성
		//Writer fw = new FileWriter("data2.txt");
		Writer fw = new FileWriter("c:/file/newFile2.txt"); 	// 기존 파일이 있으면 들어가고 없으면 새로 생김
		
		fw.write("hello~\n");
		fw.write("안녕\n");
		fw.write(66);  //정수는 아스키 코드값으로 인식
		fw.write(66+1);
		//fw.write(2.54); //실수 사용불가
		
		char[] buf = {'s', 'm', 'i', 'l', 'e'};
		fw.write(buf);
		fw.write(10);  //줄바꿈(개행 문자)
		fw.write(buf, 1, 4); //1번 인덱스 부터 4개 출력
		
		//String[] str = {"봄", "여름"};
		//fw.write(str);
		fw.write("봄");
		fw.write("여름");
		
		
		fw.close();
		
		System.out.println("수행 완료!");
	}

}
/*


*/
 