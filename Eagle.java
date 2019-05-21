public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
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

    public void setFlying(boolean flying) {
        this.flying = flying;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    @Override
    public void takeOff() {
        if (!isFlying()) {
            this.setFlying(true);
            System.out.println(this.getName() + " takes off in the sky.");
        } else {
            System.out.println(this.getName() + " is already off in th sky!");
        }
    }

    @Override
    public int ascend(int meters) {
        if (this.flying) {
            this.altitude = Math.max(this.altitude + meters, 0);
            System.out.printf("%s flies upward, altitude : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }

    @Override
    public int descend(int meters) {
        if (this.flying) {
            this.altitude = Math.max(this.altitude - meters, 0);
            System.out.printf("%s flies downward, altitude : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }

    @Override
    public void land() {
        if (this.flying && this.altitude <= 1) {
            System.out.println(this.getName() + " lands on the ground");
        } else {
            System.out.println(this.getName() + " is too high, it can't lands.");
        }
    }
}
