package by.itacademy.hw6.task3;

public class Circle implements Shape {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getSquare() {
        return Math.PI * r * r;
    }
}
