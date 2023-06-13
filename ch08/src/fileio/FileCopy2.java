package fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy2 {

	public static void main(String[] args) {
		// 이미지 파일을 읽고 쓰기(복사)
		String originFile = "c:/file/ojdbc8.jar";	// 원본 파일
		String copyFile = "c:/file/ojdbc8-1.jar";	// 사본 파일 - 파일 복사 소요시간: 15200ms
		long start = 0, end = 0;
		
		try(FileInputStream fis = new FileInputStream(originFile);
			FileOutputStream fos = new FileOutputStream(copyFile)){
			start = System.currentTimeMillis();	// 게시판 날짜 수정할 때 사용 - 기억해두세요
			
			int i;
			while((i = fis.read()) != -1) {	// 이미지 파일 읽어서
				fos.write(i);	
			}
			
			end = System.currentTimeMillis();
		}catch(IOException e) {
			e.printStackTrace();
		}		
		//System.out.println("파일 복사 소요시간: " + (end - start) + "ms");
		System.out.printf("파일 복사 소요시간: %dms\n", (end - start));
	}//main 끝
}
//파일 복사
// buffered를 사용하면 1/100로 줄어드는 효과를 확인할 수 있다 / 100배 빠르다