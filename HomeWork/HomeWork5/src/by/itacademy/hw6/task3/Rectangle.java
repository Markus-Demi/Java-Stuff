package by.itacademy.hw6.task3;

public class Rectangle implements Shape {
    double a, b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getSquare() {
        return a * b;
    }
}
