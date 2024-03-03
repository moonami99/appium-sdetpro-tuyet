package Lab.day10.lab9;

import java.security.SecureRandom;

public abstract class Animal {
    protected String name;
    protected int maxSpeed;
    protected boolean flyable;

    public Animal() {
    }

    public Animal(String name, int maxSpeed, boolean flyable) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.flyable = flyable;
    }

    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public boolean isFlyable() {
        return flyable;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", speed=" + maxSpeed +
                ", flyable=" + flyable +
                '}';
    }

    public static class Builder {
        private String name;
        private int maxSpeed;
        private boolean flyable;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Builder setFlyable(boolean flyable) {
            this.flyable = flyable;
            return this;
        }

        public Animal build() {
            return new Animal(name, maxSpeed, flyable) {
            };
        }
    }
}






