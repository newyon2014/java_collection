package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeFileWriterTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File fileOut = new File("c1.txt");
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(fileOut);
			String name ="Yonas";
			fileWriter.write(name);		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			fileWriter.close();
		}

	}

}
