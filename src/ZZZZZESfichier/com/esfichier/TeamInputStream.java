package ZZZZZESfichier.com.esfichier;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TeamInputStream {

	public static void main(String[] args) throws IOException {

		File personsFile = new File("team_persons.txt");
		FileWriter personsFileWriter = new FileWriter(personsFile);
		for(String person : TeamOutputStream.outPut()) {
			personsFileWriter.write(person);
			personsFileWriter.write("\n");
		}
		personsFileWriter.close();
	}
}
