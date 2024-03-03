package Lab.day8.lab7_2update;

abstract class Animal {
    String name;
    protected int speed;


    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Winner is " + name + ", with speed: " + getSpeed();
    }
}
