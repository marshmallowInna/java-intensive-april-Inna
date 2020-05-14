package Intarface;

public class Add implements Calculate {
    int [] ints;

  /*  @Override
    public void calculate() {// create method
       int result = 0;
        for (int anInt : ints) {
            result += anInt;
        }
        System.out.println(result);
    }*/

    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getSquare() {
        return 0;
    }
}
