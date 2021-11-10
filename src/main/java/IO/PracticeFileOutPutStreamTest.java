package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PracticeFileOutPutStreamTest {
	
	public static void main(String[] args) throws IOException {
		
		FileOutputStream outPutStream = null;
		
		byte []b = {'a','b'};
		
		outPutStream = new FileOutputStream("a2.txt");
		outPutStream.write(b);
		outPutStream.close();
		outPutStream.flush();
		
	}

}
