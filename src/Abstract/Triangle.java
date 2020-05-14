package Abstract;

import java.util.Objects;

public class Triangle extends Rectangle { // так как в прямоугольнике уже мы реализовали абстрактные классы то , когда мы наслед от него нам уже не нужно их реализовывать нет красного
    int c;  //от нас не требует реал контракт
// но если мы пред класс от которого наслед сдел абстр. (и уберем реализ то след наслед должен будет реализ абстр методы из калькул
// а мы создадим в прямоуг новый абстр метод
// добавила 2 интерфейса и просит их реализ. вызываем ctr+i смотрим что !
// абстрк методы раб с абстр и могут имплемент интерфейсы
    public Triangle() {
    }

    public Triangle(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        if (!super.equals(o)) return false;
        Triangle triangle = (Triangle) o;
        return getC() == triangle.getC();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getC());
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "c=" + c +
                ", a=" + a +
                ", b=" + b +
                "} " + super.toString();
    }

    @Override
    public double Area() {
        double p  = (a+b+c)/2;
        return (double)Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public double Perimetr() {
        return a+b+c;
    }

    @Override
    public void setName() {
        System.out.println("Triangle");

    }
}
