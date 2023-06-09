package fileio.output;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteSample {

	public static void main(String[] args) throws IOException {
		
		OutputStream os = new FileOutputStream("c:/file/test1.db");
		
		os.write(10);
		os.write(20);
		
		os.close();
		
	}

}
