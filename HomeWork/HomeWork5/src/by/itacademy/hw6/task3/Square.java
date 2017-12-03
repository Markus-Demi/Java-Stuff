package by.itacademy.hw6.task3;

public class Square implements Shape {
    double a;
    public Square(double a) {
        this.a = a;
    }

    @Override
    public double getSquare() {
        return a * a;
    }
}
