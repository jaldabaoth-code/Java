package ZZZZZquestjavaoop3;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import OOP.OOP6.Class.Bird;
import OOP.OOP6.Interface.Fly;

public class Eagle extends Bird implements Fly {
    private boolean flying = false;
    private int altitude = 0;

    public Eagle(String name) {
        super(name);
    }

    public int getAltitude() {
        return this.altitude;
    }

    public boolean isFlying() {
        return this.flying;
    }

    public String sing() {
        return "Screech!";
    }

    public void takeOff() {
        if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.printf("Eye Cherry takes off in the sky.%n");
        }

    }

    public int ascend(int meters) {
        if (this.flying) {
            this.altitude = Math.max(this.altitude + meters, 0);
            System.out.printf("Eye Cherry flies upward, altitude : %d%n", this.altitude);
        }

        return this.altitude;
    }

    public int glide() {
        if (this.flying) {
            System.out.printf("It glides into the air.%n", this.altitude);
        }

        return this.altitude;
    }

    public int descend(int meters) {
        if (this.flying && this.altitude > 0) {
            this.altitude = Math.max(this.altitude - meters, 0);
            System.out.printf("Eye Cherry flies downward, altitude : %d%n", this.altitude);
        } else {
            System.out.printf("Eye Cherry is already on the ground", this.altitude);
        }

        return this.altitude;
    }

    public int land() {
        if (this.altitude > 1) {
            System.out.printf("Eye Cherry is too high, it can't lands.%n", this.altitude);
        } else {
            System.out.printf("Eye Cherry lands on the ground.%n", this.altitude);
        }

        return this.altitude;
    }
}
