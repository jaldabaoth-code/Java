package ZZZZZESfichier.com.esfichier;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TeamOutputStream {

	public static void main(String[] args) throws IOException {
		
		for(String line : outPut()) {
			System.out.println(line);
		}
		
	}
	
	public static String[] outPut() throws IOException {
		String[] lines = new String[3];
		for(int i = 0; i < 3; i++) {
			File personsFile = new File("persons" + i + ".txt");
	
			FileReader personsFileReader = new FileReader(personsFile);
			BufferedReader personsBufferedReader = new BufferedReader(personsFileReader);
			String line;
			while((line = personsBufferedReader.readLine())!=null) {
				lines[i] = line;
			}
			
			personsBufferedReader.close();
		}
		return lines;
	}
}
