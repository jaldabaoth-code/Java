package ZZZZZquestjavacollection1;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Thanos {
    public Thanos() {
    }

    public static void main(String[] args) {
        ArrayList<Hero> heroes = new ArrayList();
        heroes.add(new Hero("Black Widow", 34));
        heroes.add(new Hero("Captain America", 100));
        heroes.add(new Hero("Vision", 3));
        heroes.add(new Hero("Iron Man", 48));
        heroes.add(new Hero("Scarlet Witch", 29));
        heroes.add(new Hero("Thor", 1500));
        heroes.add(new Hero("Hulk", 49));
        heroes.add(new Hero("Doctor Strange", 42));
        ((Hero)heroes.get(5)).setAge(1501);
        Collections.shuffle(heroes);
        heroes = new ArrayList(heroes.subList(0, heroes.size() / 2));
        Iterator var3 = heroes.iterator();

        while(var3.hasNext()) {
            Hero hero = (Hero)var3.next();
            System.out.println(hero.getName());
        }

    }
}
