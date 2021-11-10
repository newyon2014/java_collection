package IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PacticeFileInputStreamBufferTest {

	public static void main(String[] args) throws IOException {

		FileInputStream inputStream = new FileInputStream("a1.txt");
		BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
		int data_control;
		while((data_control=bufferedInputStream.read())!=-1) {
			//inputStream.read();
			System.out.print((char) data_control);
		}
		
		inputStream.close();
	}
}
