package Interface2;

public class Main {
    public static void main(String[] args) {
      //  Calculate c = new Calculate() ;
       // Object o = {new Square(),new Rectangle(),new Triangle(),new Circle()};
        Triangle t =new Triangle(2.0,5.0,9.0);
        t.getName();
        System.out.println(t.perimetr());
        System.out.println(t.area());
        Square r = new Square(3.0,8.0);
        r.getName();
        System.out.println(r.area());
        System.out.println(r.perimetr());
        Circle c = new Circle(8.0);
        c.getName();
        System.out.println(c.perimetr());
        System.out.println(c.area());





    }
}

