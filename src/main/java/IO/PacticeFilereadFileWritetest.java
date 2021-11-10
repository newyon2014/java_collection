package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PacticeFilereadFileWritetest {
	
	public static void main(String[] args) throws IOException {
		
		File fileIn = new File ("d1.txt");
		File fileOut = new File("d2.txt");
		FileReader fileReader = null;
		FileWriter fileWriter = null;
		
		try {
			fileReader = new FileReader(fileIn);
			fileWriter = new FileWriter(fileOut);
			int data_control;
			while((data_control=fileReader.read())!=1) {
				fileWriter.write(data_control);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			fileReader.close();
			fileWriter.close();
		}
		
		
	}

}
