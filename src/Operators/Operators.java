package Operators;

/* Quest : Operators */
public class Operators {
    /* Main method that can run the quest Operators */
    public static void main(String[] args) {
        System.out.println("\n--- Quest : Operators ---");
        int first = 3;
        System.out.println(" - The first value after 'int first = 3;' is : " + first);

        int second = 4;
        System.out.println(" - The second value after 'int second = 4;' is : " + second);

        int third = ((first + 7 - first * 4) / 2) % 2;
        System.out.println(" - The third value after 'int third = ((first + 6 - first * 3) / 2) % 2;' is : " + third);

        third++;
        System.out.println(" - The third value after 'third++;' is : " + third);

        second = third;
        System.out.println(" - The second value after 'second = third;' is : " + second);

        second--;
        System.out.println(" - The second value after 'second--;' is : " + second);

        if (second < 5) {
            second = 5 / second;
            System.out.println(" - The second value after 'second = 5 / second;' is : " + second);
        }

        System.out.println(" - At the end first value is : " + first);
        System.out.println(" - At the end second value is : " + second);
        System.out.println(" - At the end third value is : " + third);
    }
}
