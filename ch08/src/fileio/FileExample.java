package fileio;

import java.io.File;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) throws IOException {
		// 
		File file = new File("c:/file/newFile.txt");	// 파일생성 및 경로
		// 이대로 사용하면 안되겠죠
		file.createNewFile();
		
		System.out.println(file.isFile());		// 출력값 - true
		System.out.println(file.isDirectory());	// 디렉터리는 아님
		System.out.println(file.getName());		// 파일 이름
		System.out.println(file.getPath()); 	// 파일의 위치(경로)
		System.out.println(file.length() + "B");// 파일의 용량(크기)
		
		//System.out.println("파일 생성");

	}

}
