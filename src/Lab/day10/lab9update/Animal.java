package Lab.day10.lab9update;

public class Animal {
    private String name;
    private int speed;
    private boolean flyable;

    protected Animal(Builder builder){
        this.name = builder.name;
        this.flyable = builder.flyable;
        this.speed = builder.speed;
    }
    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isFlyable() {
        return flyable;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", flyable=" + flyable +
                '}';
    }

    public static class Builder{
        private String name;
        private int speed;
        private boolean flyable;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public Builder setFlyable(boolean flyable) {
            this.flyable = flyable;
            return this;
        }
        public Animal build(){
            return new Animal(this);
        }
    }
}
