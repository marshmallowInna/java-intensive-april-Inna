package Intarface;

public class Main {
    public static void main(String[] args) {
        //Object o = new Circle();
        Calculate[] calculates =  {new Add(),new Circle(6), new Triangle(7,4)};
        Calculate c = new Circle(5);
        Calculate cTriangle = calculates[0];
        cTriangle.getSquare();

        Calculate cCircle = calculates[1];

        Calculate c1 =  new Triangle(5,8);
       // c1.calculate();
        //c1.getName();
        //c1.getSquare();

        System.out.println("Name: " + c.getName());
        System.out.println("Square: " + c.getSquare());
        System.out.println("Name: " + c1.getName());
        System.out.println("Square: " + c1.getSquare());

        }
        }


