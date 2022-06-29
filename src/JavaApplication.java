import Collections.CollectionArrayList.CollectionArrayList;
import Collections.CollectionList.CollectionList;
import Collections.CollectionMap.CollectionMap;
import Collections.CollectionTreeSet.CollectionTreeSet;
import ESFiles.PersonInputStream.PersonInputStream;
import ESFiles.PersonOutputStream.PersonOutputStream;
import Inheritance.Hangar;
import Operators.Operators;
import POO.POO3.WhoIAm;
import POO.POO6.Nature;
import java.io.IOException;

/* Java quests */
public class JavaApplication {
    /* Main method that can run all java quests */
    public static void main(String[] args) throws IOException {
        /* Quest : Operators */
        operators();

        /* Quest : Collection 1 (ArrayList) */
        collectionArrayList();

        /* Quest : Collection 2 (List) */
        collectionList();

        /* Quest : Collection 3 (TreeSet) */
        collectionTreeSet();

        /* Quest : Collection 4 (Map) */
        collectionMap();

        /* Quest : ESFile 1 (InputStream to a File) */
        personInputStream();

        /* Quest : ESFile 2 (OutputStream from a File) */
        personOutputStream();

        /* Quest : POO 3 */
        poo3();

        /* Quest : POO 6 */
        poo6();

        /* Quest : Inheritance */
        inheritance();
    }

    /* Quest : Operators */
    public static void operators() {
        String[] args = {};
        new Operators().main(args);
    }

    /* Quest : Collection 1 (ArrayList) */
    public static void collectionArrayList() {
        String[] args = {};
        new CollectionArrayList().main(args);
    }

    /* Quest : Collection 2 (List) */
    public static void collectionList() {
        String[] args = {};
        new CollectionList().main(args);
    }

    /* Quest : Collection 3 (TreeSet) */
    public static void collectionTreeSet() {
        String[] args = {};
        new CollectionTreeSet().main(args);
    }

    /* Quest : Collection 4 (Map) */
    public static void collectionMap() {
        String[] args = {};
        new CollectionMap().main(args);
    }

    /* Quest : ESFile 1 (InputStream to a File) */
    public static void personInputStream() throws IOException {
        String[] args = {};
        new PersonInputStream().main(args);
    }

    /* Quest : ESFile 2 (OutputStream from a File) */
    public static void personOutputStream() throws IOException {
        String[] args = {};
        new PersonOutputStream().main(args);
    }

    /* Quest : POO 3 */
    public static void poo3() {
        String[] args = {};
        new WhoIAm().main(args);
    }

    /* Quest : POO 6 */
    public static void poo6() {
        String[] args = {};
        new Nature().main(args);
    }

    /* Quest : Inheritance */
    public static void inheritance() {
        String[] args = {};
        new Hangar().main(args);
    }
}
