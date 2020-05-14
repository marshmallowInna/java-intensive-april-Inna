package Interface2;

public class Square implements Calculate {
     double a, b;


    public Square() {
    }

    public Square(double a, double b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public void getName() {
        System.out.println("Rectangle");
    }

    @Override
    public double area() {
        return a*b;
    }

    @Override
    public double perimetr() {
        return (a+b)*2;
    }


}


