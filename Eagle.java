

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

    @Override
    public void takeOff() {
        if (this.flying == false && this.getAltitude() <= 0) {
            System.out.println(getName() + " takes off in the sky.");
            this.flying = true;
        }
    }

    @Override
    public void land() {
        if (this.altitude <= 1 ) {
            System.out.println(this.getName() + " lands on the ground.");
        } else {
            System.out.println(this.getName() + " is too high, it can't lands.");
        }
    }

    @Override
    public int ascend(int meters) {
        if (this.isFlying()) {
            this.altitude = this.altitude + meters;
            System.out.println(this.getName() + "  flies upward, altitude : " + this.altitude);
        }
        return this.altitude;
    }

    @Override
    public int descend(int meters) {
        if (this.isFlying()) {
            this.altitude = this.altitude - meters;
            System.out.println(this.getName() + "  flies downward, altitude : " + this.altitude);
        }
        return this.altitude;
    }

    @Override
    public void glide() {
        
    }
}
