package IO;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PracticeFileOutPutStreamBufferedTest {
	
	public static void main(String[] args) throws IOException {
		
		FileOutputStream outPutStream = new FileOutputStream("b1.txt");
		BufferedOutputStream bufferedStream = new BufferedOutputStream(outPutStream);
		String name = "Yonas";
		byte[] byteData = name.getBytes();
		bufferedStream.write(byteData);
		bufferedStream.close();
		bufferedStream.flush();
	}

}
