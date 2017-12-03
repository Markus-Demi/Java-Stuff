package by.itacademy.task1.Climate;

public class Conditioner extends ClimateTech {
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
