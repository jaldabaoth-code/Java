package POO.POO6;

import POO.POO6.Class.Hawkeye;
import POO.POO6.Class.Penguin;

/* Quest : POO 6 */
public class Nature {
    /* Main method that can run the quest POO 6 */
    public static void main(String[] args) {
        System.out.println("\n--- Quest : POO 6 ---");
        // Penguin
        Penguin penguin = new Penguin("Penguin");
        System.out.println("When the animal is \"" + penguin.getName() + "\"" + ", it do " + penguin.sing());
        penguin.dive();
        penguin.swimDown(3);
        penguin.swimUp(1);
        penguin.swimDown(4);
        penguin.swimUp(5);
        penguin.swimUp(1);
        penguin.getOut();
        // Eagle
        Hawkeye hawkeye = new Hawkeye("Hawkeye");
        System.out.println("When the animal is \"" + hawkeye.getName() + "\"" + ", it do " + hawkeye.sing());
        hawkeye.takeOff();
        hawkeye.ascend(120);
        hawkeye.ascend(30);
        hawkeye.glide();
        hawkeye.descend(140);
        hawkeye.land();
        hawkeye.descend(9);
        hawkeye.land();
    }
}
