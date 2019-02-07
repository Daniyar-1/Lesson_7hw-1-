public class Plane implements Runnable,Limit {
    @Override
    public void run() {

    }

    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Plane(int speed) {
        this.speed = speed;
    }

    @Override
    public int getMinimum() {
        return 0;
    }

    @Override
    public int getMaximum() {
        return 0;
    }
}
