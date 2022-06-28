package ESFile.PersonInputStream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/* Quest : ESFile 1 PersonInputStream (InputStream to a File) */
public class PersonInputStream {
    /* Main method that can run the quest PersonInputStream */
    public static void main(String[] args) throws IOException {
        System.out.println("\n--- Quest : ESFile 1 (PersonInputStream) ---");
        String[] persons = {"Sophie", "Thomas", "Antoine"};
        int personsSize = persons.length;
        String fileAddress = "src/ESFile/PersonInputStream/Resources/";
        // Loop for create files
        for(int i = 0; i < personsSize; i++) {
            // Create the file
            File personsFile = new File(fileAddress + "CreatedFile" + persons[i] + ".txt");
            FileWriter personsFileWriter = new FileWriter(personsFile);
            // Write on the file
            personsFileWriter.write(persons[i] + ", Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \n");
            personsFileWriter.close();
        }
        System.out.println(personsSize + " files have been created and edited at : " + fileAddress);
    }
}
