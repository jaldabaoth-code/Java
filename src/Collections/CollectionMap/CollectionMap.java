package Collections.CollectionMap;

import Collections.Hero;
import java.util.*;
import Collections.Flower;

/* Quest : Collection 4 (Map) */
public class CollectionMap {
    /* Main method that can run the quest Collection 4 (Map) */
    public static void main(String[] args) {
        System.out.println("\n--- Quest : Collection 4 (Map) ---");
        // TODO 0 : Create heroes and the flowers
        Hero hulk = new Hero("Hulk", 49);
        Hero blackWidow = new Hero("Black Widow", 34);
        Hero captainAmerica = new Hero("Captain America", 100);
        Hero thor = new Hero("Thor", 1501);
        Hero vision = new Hero("Vision", 3);
        Hero scarletWitch = new Hero("Scarlet Witch", 29);
        Hero doctorStrange = new Hero("Doctor Strange", 42);
        Flower lily = new Flower("Lily");
        Flower tulip = new Flower("Tulip");
        Flower begonia = new Flower("Begonia");
        Flower violet = new Flower("Violet");
        Flower rose = new Flower("Rose");

        // TODO 1 : Create a TreeMap where :
        // Hulk, Thor and Scarlet Witch have a Rose
        // Vision has a Tulip
        // Captain America has a Lily
        // Doctor Strange and Black Widow have a Violet
        Comparator<Hero> comparator = new Comparator<Hero>() {
            @Override
            public int compare(Hero orig, Hero compare) {
                return orig.getName().compareTo(compare.getName());
            }
        };
        Map<Hero, Flower> party = new TreeMap<>(comparator);
        party.put(hulk, rose);
        party.put(thor, rose);
        party.put(scarletWitch, rose);
        party.put(vision, tulip);
        party.put(captainAmerica, lily);
        party.put(doctorStrange, violet);
        party.put(blackWidow, violet);
        System.out.println("TODO 0 : Create heroes and the flowers");
        System.out.println("TODO 1 : Create a TreeMap where heroes have flowers");
        showHeroes(party);

        // TODO 2 : Print if `begonia` is contained in the TreeMap
        System.out.println("TODO 2 : Print if `begonia` is contained in the TreeMap");
        if (party.containsValue(begonia)) {
            System.out.println(" - There are \"begonia\" in the TreeMap");
        } else {
            System.out.println(" - There are no \"begonia\" in the TreeMap");
        }

        // TODO 3 : For each hero, alphabetically, print the corresponding flower
        System.out.println("TODO 3 : For each hero, alphabetically, print the corresponding flower");
        showHeroes(party);
    }

    /* Display heroes from Map */
    private static void showHeroes(Map<Hero, Flower> party) {
        for (Hero hero : party.keySet()) {
            System.out.println(" - Hero name is \"" + hero.getName() + "\" and his age is : " + hero.getAge()  + " he/she have \"" + party.get(hero).getName() + "\" as flower");
        }
    }
}
