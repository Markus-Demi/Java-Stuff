package by.itacademy.task1.large;

public class Washer extends LargeTech {
    @Override
    public void consumeEnergy() {
        System.out.println("consume");
    }

    @Override
    public void turnOn() {
        System.out.println("on");
    }

    @Override
    public void turnOff() {
        System.out.println("off");
    }
}
