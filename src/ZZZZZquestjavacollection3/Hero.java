package ZZZZZquestjavacollection3;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Hero implements Comparable<Hero> {
    private String name;
    private int age;

    public int compareTo(Hero hero) {
        return this.getAge() - hero.getAge();
    }

    public Hero(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
