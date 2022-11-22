package ZZZZZquestjavacollection2;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Thanos {
    public Thanos() {
    }

    public static void main(String[] args) {
        List<Hero> heroes = new ArrayList();
        heroes.add(new Hero("Hulk", 49));
        heroes.add(new Hero("Black Widow", 34));
        heroes.add(new Hero("Captain America", 100));
        heroes.add(new Hero("Thor", 1501));
        Collections.sort(heroes);
        System.out.println("\nOrder by name:");
        showList(heroes);
        Comparator<Hero> comparator = new Comparator<Hero>() {
            public int compare(Hero hero2, Hero hero1) {
                return hero1.getAge() - hero2.getAge();
            }
        };
        Collections.sort(heroes, comparator);
        System.out.println("\nOrder by age:");
        showList(heroes);
    }

    private static void showList(List<Hero> heroes) {
        Iterator var2 = heroes.iterator();

        while(var2.hasNext()) {
            Hero heroe = (Hero)var2.next();
            System.out.println(heroe.getName() + ", " + heroe.getAge());
        }

    }
}
