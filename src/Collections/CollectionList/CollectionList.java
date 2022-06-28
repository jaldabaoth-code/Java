package Collections.CollectionList;

import Collections.Hero;
import java.util.*;

/* Quest : Collection 2 (List) */
public class CollectionList {
    /* Main method that can run the quest Collection 2 (List) */
    public static void main(String[] args) {
        System.out.println("\n--- Quest : Collection 2 (List) ---");
        // TODO 0 : Create an empty heroes list and Add heroes to the list
        List<Hero> heroes = new ArrayList<>();
        heroes.add(new Hero("Hulk", 49));
        heroes.add(new Hero("Black Widow", 34));
        heroes.add(new Hero("Captain America", 100));
        heroes.add(new Hero("Thor", 1501));
        System.out.println("TODO 0 : Create an empty heroes list and Add heroes to the list");
        showHeroes(heroes);

        // TODO 1 : Modify Hero to implements Comparable and sort by name (ascending)
        Collections.sort(heroes, new Comparator<Hero>() {
            @Override
            public int compare(Hero hero1, Hero hero2) {
                return hero1.getName().compareTo(hero2.getName());
            }
        });
        System.out.println("TODO 1 : Modify Hero to implements Comparable and sort by name (ascending)");
        showHeroes(heroes);

        // TODO 2: Add a Comparator and sort by age (descending)
        Collections.sort(heroes, new Comparator<Hero>() {
            @Override
            public int compare(Hero hero1, Hero hero2) {
                return hero2.getAge() - hero1.getAge();
            }
        });
        System.out.println("TODO 2: Add a Comparator and sort by age (descending)");
        showHeroes(heroes);
    }

    /* Display heroes from List */
    private static void showHeroes(List<Hero> heroes) {
        for (Hero hero : heroes) {
            System.out.println(" - " + heroes.indexOf(hero) + " - Hero name is \"" + hero.getName() + "\" and his age is : " + hero.getAge());
        }
    }
}
