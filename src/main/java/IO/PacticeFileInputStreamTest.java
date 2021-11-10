package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PacticeFileInputStreamTest {

	public static void main(String[] args) throws IOException {

		FileInputStream inputStream = null;
		inputStream = new FileInputStream("a1.txt");
		int data_reader_control;
		while((data_reader_control=inputStream.read())!=-1) {
			//inputStream.read();
			System.out.print((char) data_reader_control);
		}
		
		inputStream.close();
	}
}
