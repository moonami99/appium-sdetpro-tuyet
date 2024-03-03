package Lab.day8.lab7_2;

abstract class Animal {
    String name;
    protected int maxSpeed;

    Animal(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    abstract int getSpeed();

    @Override
    public String toString() {
        return "Winner is " + name + ", with speed: " + getSpeed();
    }
}
