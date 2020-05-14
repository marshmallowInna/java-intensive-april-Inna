package Intarface;

public class Triangle implements Calculate {

    private double hieght;
    private double width;

    public Triangle (double h, double w){
        hieght = h;
        width = w;
    }



    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public double getSquare() {
        return hieght*width ;
    }
}
