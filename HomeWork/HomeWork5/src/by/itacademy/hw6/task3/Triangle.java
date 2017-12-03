package by.itacademy.hw6.task3;

public class Triangle implements Shape {
    double a, h;
    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double getSquare() {
        return 0.5 * h * a;
    }
}
