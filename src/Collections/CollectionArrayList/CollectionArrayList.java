package Collections.CollectionArrayList;

import Collections.Hero;
import java.util.*;

/* Quest : Collection 1 (ArrayList) */
public class CollectionArrayList {
    /* Main method that can run the quest Collection 1 (ArrayList) */
    public static void main(String[] args) {
        System.out.println("\n--- Quest : Collection 1 (ArrayList) ---");
        // TODO 1 : Create an empty heroes list
        ArrayList<Hero> heroes = new ArrayList<>();
        System.out.println("TODO 1 : Create an empty heroes list");
        System.out.println(" - " + heroes);

        // TODO 2 : Add those heroes to the list
        // name: Black Widow, age: 34
        // name: Captain America, age: 100
        // name: Vision, age: 3
        // name: Iron Man, age: 48
        // name: Scarlet Witch, age: 29
        // name: Thor, age: 1500
        // name: Hulk, age: 49
        // name: Doctor Strange, age: 42
        heroes.add(new Hero("Black Widow", 34));
        heroes.add(new Hero("Captain America", 100));
        heroes.add(new Hero("Vision", 3));
        heroes.add(new Hero("Iron Man", 48));
        heroes.add(new Hero("Scarlet Witch", 29));
        heroes.add(new Hero("Thor", 1500));
        heroes.add(new Hero("Hulk", 49));
        heroes.add(new Hero("Doctor Strange", 42));
        System.out.println("TODO 2 : Add some heroes to the list");
        showHeroes(heroes);

        // TODO 3 : It's Thor birthday, now he's 1501
        heroes.get(5).setAge(1501);
        System.out.println("TODO 3 : It's Thor birthday, now he's 1501");
        showHeroes(heroes);

        // TODO 4 : Shuffle the heroes list
        Collections.shuffle(heroes);
        System.out.println("TODO 4 : Shuffle the heroes list");
        showHeroes(heroes);

        // TODO 5 : Keep only the half of the list
        heroes = new ArrayList<Hero> (heroes.subList(0, heroes.size()/2));
        System.out.println("TODO 5 : Keep only the half of the list");
        showHeroes(heroes);

        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        System.out.println("TODO 6 : Loop throught the list and display the name of the remaining heroes");
        showHeroes(heroes);
    }

    /* Display heroes from ArrayList */
    private static void showHeroes(ArrayList<Hero> heroes) {
        for (Hero hero : heroes) {
            System.out.println(" - " + heroes.indexOf(hero) + " - Hero name is \"" + hero.getName() + "\" and his age is : " + hero.getAge());
        }
    }
}
