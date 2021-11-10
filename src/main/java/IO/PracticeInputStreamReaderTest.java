package IO;

import com.sun.org.apache.xml.internal.utils.SystemIDResolver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PracticeInputStreamReaderTest {
	
	public static void main(String[] args) throws IOException {

		InputStreamReader inputReader = new InputStreamReader(System.in);
		BufferedReader bufferedreader = new BufferedReader(inputReader);
		bufferedreader.readLine();
	}

}
