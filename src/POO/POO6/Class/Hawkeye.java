package POO.POO6.Class;

import POO.POO6.Interface.Fly;

public class Hawkeye extends Bird implements Fly {
    private boolean flying;
    private int altitude;

    public Hawkeye(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }


    @Override
    public void takeOff() {
        if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.printf(" - " + this.getName() + " takes off in the sky%n");
        }
    }

    @Override
    public int ascend(int meters) {
        if (this.flying) {
            this.altitude = Math.max(this.altitude + meters, 0);
            System.out.printf(" - " + this.getName() + " flies upward " + meters + " meters altitude and actual altitude is " + this.altitude + " meters%n");
        }
        return this.altitude;
    }

    @Override
    public int glide() {
        if (this.flying) {
            System.out.printf(" - " + this.getName() + " glides into the air, and actual altitude is " + this.altitude + " meters%n");
        }
        return this.altitude;
    }

    @Override
    public int descend(int meters) {
        if (this.flying && this.altitude > 0) {
            this.altitude = Math.max(this.altitude - meters, 0);
            System.out.printf(" - " + this.getName() + " flies downward " + meters + " meters altitude and actual altitude is " + this.altitude + " meters%n");
        } else {
            System.out.printf(" - " + this.getName() + " is already on the ground " + this.altitude + " meters%n");
        }
        return this.altitude;
    }

    @Override
    public int land() {
        if (this.altitude > 1) {
            System.out.printf(" - " + this.getName() + " is too high, it can't lands%n", this.altitude);
        } else {
            System.out.printf(" - " + this.getName() + " lands on the ground%n", this.altitude);
        }
        return this.altitude;
    }
}
