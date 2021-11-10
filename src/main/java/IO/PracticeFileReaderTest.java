package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PracticeFileReaderTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File fileIn = new File("c1.txt");
		FileReader filereader = null;
		try {
			filereader = new FileReader(fileIn);
			int data_reader_control;
			while ((data_reader_control = filereader.read()) != 1) {
				System.out.println((char) data_reader_control);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			filereader.close();
		}

	}

}
