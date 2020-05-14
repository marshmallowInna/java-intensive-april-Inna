package Interface2;

import java.util.Objects;

public class Triangle implements Calculate {
     double a, b, c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.getA(), getA()) == 0 &&
                Double.compare(triangle.getB(), getB()) == 0 &&
                Double.compare(triangle.getC(), getC()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getA(), getB(), getC());
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    @Override
    public void getName() {
        System.out.println("Triangle");

    }

    @Override
    public double area() {
        double p = perimetr()/2;
        return (double)Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public double perimetr() {
        return a*b*c;
    }
}

