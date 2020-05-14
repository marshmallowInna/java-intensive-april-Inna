package Intarface;

public class Circle implements Calculate {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public double getSquare() {
        return 3.1415926*radius*radius;
    }
}

