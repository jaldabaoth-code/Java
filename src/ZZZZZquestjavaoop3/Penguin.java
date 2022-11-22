package ZZZZZquestjavaoop3;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import OOP.OOP6.Class.Bird;
import OOP.OOP6.Interface.Swim;

public class Penguin extends Bird implements Swim {
    private boolean swimming = false;
    private int depths = 0;

    public Penguin(String name) {
        super(name);
    }

    public String sing() {
        return "Quack!";
    }

    public int getDepths() {
        return this.depths;
    }

    public boolean isSwimming() {
        return this.swimming;
    }

    public void dive() {
        if (!this.swimming && this.depths == 0) {
            this.swimming = true;
            System.out.printf("%s dives into the water.%n", this.getName());
        }

    }

    public int swimDown(int meters) {
        if (this.swimming) {
            this.depths = Math.min(this.depths + meters, 325);
            System.out.printf("%s swims downward, depths : %d%n", this.getName(), this.depths);
        }

        return this.depths;
    }

    public int swimUp(int meters) {
        if (this.swimming) {
            this.depths = Math.max(this.depths - meters, 0);
            System.out.printf("%s swims upward, depths : %d%n", this.getName(), this.depths);
        }

        return this.depths;
    }

    public void getOut() {
        if (this.swimming && this.depths == 0) {
            System.out.printf("%s gets out of the water.%n", this.getName());
        } else {
            System.out.printf("%s is too deep, it can't get out.%n", this.getName());
        }

    }
}
