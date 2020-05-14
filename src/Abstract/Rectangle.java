package Abstract;

import java.util.Objects;

public class Rectangle extends Calculate {
    int a, b;

    public Rectangle() {
    }

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) o;
        return getA() == rectangle.getA() &&
                getB() == rectangle.getB();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getA(), getB());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }


    @Override
    public double Area() {
        return a * b;
    }

    @Override
    public double Perimetr() {
        return (a + b) * 2;
    }

    @Override
    public void setName() {
        System.out.println("Rectangle");
    }
}



