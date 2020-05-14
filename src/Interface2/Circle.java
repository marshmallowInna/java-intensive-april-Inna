package Interface2;

import java.util.Objects;

public class Circle implements Calculate {

     double r;
    // double PI = 3.14;

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.getR(), getR()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getR());
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }

    @Override
    public void getName() {
        System.out.println("Circle");

    }

    @Override
    public double area() {
        return Math.PI*Math.pow(r,2);
    }

    @Override
    public double perimetr() {
        return (double) (2*Math.PI*r);
    }



    /* public double getSquare() {
        return Math.PI*Math.pow(r,2);
    }*/
}
