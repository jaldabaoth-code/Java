package Collections.CollectionTreeSet;

import Collections.Hero;
import java.util.*;

/* Quest : Collection 3 (TreeSet) */
public class CollectionTreeSet {
    /* Main method that can run the quest Collection 3 (TreeSet) */
    public static void main(String[] args) {
        System.out.println("\n--- Quest : Collection 3 (TreeSet) ---");
        // TODO 0 : Create an empty heroes list and Add heroes to the list
        TreeSet<Hero> heroes = new TreeSet<>();
        heroes.add(new Hero("Hulk", 49));
        heroes.add(new Hero("Black Widow", 34));
        heroes.add(new Hero("Captain America", 100));
        heroes.add(new Hero("Thor", 1501));
        heroes.add(new Hero("Vision", 3));
        heroes.add(new Hero("Scarlet Witch", 29));
        heroes.add(new Hero("Doctor Strange", 42));
        System.out.println("TODO 0 : Create an empty heroes list and Add heroes to the list");
        showHeroes(heroes);

        // TODO 1 : Retrieve and remove the oldest hero in one line
        Hero oldest = heroes.pollLast();
        System.out.println("TODO 1 : Retrieve and remove the oldest hero in one line");
        showHeroes(heroes);
        System.out.println(oldest == null ? "" : " - The oldest hero was \"" + oldest.getName() +  "\" and he was " + oldest.getAge() + " old");

        // TODO 2: Show heroes by age (descending)
        System.out.println("TODO 2: Show heroes by age (descending)");
        showHeroes((TreeSet<Hero>) heroes.descendingSet());

        // TODO 3: Show heroes by age (ascending), from Spider-Man (include) to Iron Man (include)
        Hero spiderman = new Hero("Spider-Man", 18);
        Hero ironman = new Hero("Iron Man", 48);
        heroes.add(spiderman);
        heroes.add(ironman);
        System.out.println("TODO 3: Show heroes by age (ascending), from Spider-Man (include) to Iron Man (include)");
        showHeroes((TreeSet<Hero>) heroes.subSet(spiderman, true, ironman, true));
    }

    /* Display heroes from TreeSet */
    private static void showHeroes(TreeSet<Hero> heroes) {
        for (Hero hero : heroes) {
            System.out.println(" - Hero name is \"" + hero.getName() + "\" and his age is : " + hero.getAge());
        }
    }
}
