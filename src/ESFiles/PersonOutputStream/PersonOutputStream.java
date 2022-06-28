package ESFiles.PersonOutputStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* Quest : ESFile 2 PersonOutputStream (OutputStream from a File) */
public class PersonOutputStream {
    /* Main method that can run the quest PersonOutputStream */
    public static void main(String[] args) throws IOException {
        System.out.println("\n--- Quest : ESFile 2 (PersonOutputStream) ---");
        String[] persons = {"Sophie", "Thomas", "Antoine"};
        int personsSize = persons.length;
        String fileAddress = "src/ESFiles/PersonOutputStream/Resources/";
        // Loop for read files
        System.out.println(personsSize + " files have been read at : " + fileAddress);
        for(int i = 0; i < personsSize; i++) {
            File personsFile = new File(fileAddress + "ReadFile" + persons[i] + ".txt");
            FileReader personsFileReader = new FileReader(personsFile);
            BufferedReader personsBufferedReader = new BufferedReader(personsFileReader);
            String line;
            int fileNumber = i +1;
            while((line = personsBufferedReader.readLine()) != null) {
                String message = fileNumber + ". It read on the file - " + fileAddress + "ReadFile" + persons[i] + ".txt";
                System.out.println(" - " + message + " : " + line);
            }
            personsBufferedReader.close();
        }
    }
}
