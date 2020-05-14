package Abstract;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(4, 2);
        System.out.println(r.Area());
        System.out.println(r.Perimetr());
        r.setName();
        Triangle t = new Triangle(7,8,9);
        System.out.println(t.Area());
        System.out.println(t.Perimetr());
        t.setName();

    }
}





