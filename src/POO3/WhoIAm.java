package POO3;

/* Quest : POO 3 */
public class WhoIAm {
    /* Main method that can run the quest POO 3 */
    public static void main(String[] args) {
        System.out.println("\n--- Quest : POO 3 ---");
        System.out.println(WhoIAm());
    }

    static Aware aware = new Aware();

    public static String WhoIAm() {
        String message;
        if (aware.isAware() == true) {
            aware.setFirstname("Jean-Claude");
            message = "My name is " + aware.getFirstname() + " and I am aware";
        } else {
            aware.setFirstname("Henri");
            message = "My name is " + aware.getFirstname() + " and I am not aware";
        }
        return message;
    }
}
