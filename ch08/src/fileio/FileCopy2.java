package fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy2 {

	public static void main(String[] args) {
		// 이미지 파일을 읽고 쓰기(복사)
		String originFile = "c:/file/bg1.jpg";	// 원본 파일
		String copyFile = "c:/file/bg3.jpg";	// 사본 파일
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