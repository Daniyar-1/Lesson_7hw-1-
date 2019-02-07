public class Cheetah implements Runnable,Limit {
    private int speed;

    @Override
    public void run() {

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Cheetah(int speed) {
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
