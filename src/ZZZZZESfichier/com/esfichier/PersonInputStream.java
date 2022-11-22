package ZZZZZESfichier.com.esfichier;
 
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PersonInputStream {
	public static void main(String[] args) throws IOException {
		String[] person = {"Raphael", "Thuy", "Gersey"};

		for(int i = 0; i<3; i++) {
			File personsFile = new File("persons" + i + ".txt");

			FileWriter personsFileWriter = new FileWriter(personsFile);
			personsFileWriter.write(person[i]);
			personsFileWriter.write("\n");
			personsFileWriter.close();
		}

	}
}
