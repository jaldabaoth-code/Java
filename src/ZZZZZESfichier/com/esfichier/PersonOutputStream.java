package ZZZZZESfichier.com.esfichier;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PersonOutputStream {

	public static void main(String[] args) throws IOException {
		outPut();
	}
	
	public static void outPut() throws IOException {
		for(int i = 0; i < 3; i++) {
			File personsFile = new File("persons" + i + ".txt");
	
			FileReader personsFileReader = new FileReader(personsFile);
			BufferedReader personsBufferedReader = new BufferedReader(personsFileReader);
			String line;
			while((line = personsBufferedReader.readLine())!=null) {
			    System.out.println(line);
			    
			}
			personsBufferedReader.close();
		}
	}
}
