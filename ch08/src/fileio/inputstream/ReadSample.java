package fileio.inputstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadSample {

	public static void main(String[] args) throws IOException {
		//read에서 읽을때 InputStream
		InputStream is = new FileInputStream("c:/file/test1.db");
		
		/*while(true) {
			int data = is.read();
			if(data == -1) 
				break;
			System.out.println(data);
		}*/
		
		int data;
		
		while((data = is.read()) != -1) {
			System.out.println(data);
		}
		is.close();
		
	}

}
/*
package fileio.inputstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadSample {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("c:/file/test1.db");
		
		/*while(true) {
			int data = is.read();
			if(data == -1) 
				break;
			System.out.println(data);
		}
		
		int data;
		while((data = is.read()) != -1) {
			System.out.println(data);
		}
	}
}
*/
