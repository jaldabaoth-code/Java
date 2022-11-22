package ZZZZZquestjavacollection3;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Iterator;
import java.util.TreeSet;

public class Thanos {
    public Thanos() {
    }

    public static void main(String[] args) {
        TreeSet<Hero> heroes = new TreeSet();
        heroes.add(new Hero("Hulk", 49));
        heroes.add(new Hero("Black Widow", 34));
        heroes.add(new Hero("Captain America", 100));
        heroes.add(new Hero("Thor", 1501));
        heroes.add(new Hero("Vision", 3));
        heroes.add(new Hero("Scarlet Witch", 29));
        heroes.add(new Hero("Doctor Strange", 42));
        Hero oldest = (Hero)heroes.pollLast();
        System.out.println("\nOldest hero:");
        System.out.println(oldest == null ? "" : oldest.getName());
        System.out.println("\nHeroes by age (descending) :");
        Iterator var4 = heroes.descendingSet().iterator();

        Hero spiderman;
        while(var4.hasNext()) {
            spiderman = (Hero)var4.next();
            System.out.println(spiderman.getName() + ", " + spiderman.getAge());
        }

        spiderman = new Hero("Spider-Man", 18);
        Hero ironman = new Hero("Iron Man", 48);
        heroes.add(spiderman);
        heroes.add(ironman);
        System.out.println("\nSubset of heroes :");
        Iterator var6 = heroes.subSet(spiderman, true, ironman, true).iterator();

        while(var6.hasNext()) {
            Hero hero = (Hero)var6.next();
            System.out.println(hero.getName() + ", " + hero.getAge());
        }

    }
}
