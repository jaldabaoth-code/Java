package POO6.Class;

import POO6.Interface.Swim;

public class Penguin extends Bird implements Swim {
    private boolean swimming;
    private int depths;

    public Penguin(String name) {
        super(name);
        this.swimming = false;
        this.depths = 0;
    }

    @Override
    public String sing() {
        return "Quack!";
    }

    public int getDepths() {
        return depths;
    }

    public boolean isSwimming() {
        return swimming;
    }

    /* dives, must be on ground */
    @Override
    public void dive() {
        if (!this.swimming && this.depths == 0) {
            this.swimming = true;
            System.out.printf(" - %s dives into the water%n", this.getName());
        }
    }

    /* swim downward, depths increase */
    @Override
    public int swimDown(int meters) {
        if (this.swimming) {
            this.depths = Math.min(this.depths + meters, 325);
            System.out.printf(" - " + this.getName() + " swims downward " + meters + " meters and actual depths is : " + this.depths + " meters%n");
        }
        return this.depths;
    }

    /* swin upward, depths decrease */
    @Override
    public int swimUp(int meters) {
        if (this.swimming) {
            this.depths = Math.max(this.depths - meters, 0);
            System.out.printf(" - " + this.getName() + " swims upward " + meters + " meters and actual depths is : " + this.depths + " meters%n");
        }
        return this.depths;
    }

    /*  get out of water, must be on surface */
    @Override
    public void getOut() {
        if (this.swimming && this.depths == 0) {
            System.out.printf(" - %s gets out of the water%n", this.getName());
        } else {
            System.out.printf(" - %s is too deep, it can't get out%n", this.getName());
        }
    }
}
