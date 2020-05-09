package Intarface;

public class Add implements Calculate {
    int [] ints;

    @Override
    public void calculate() {// create method
       int resul = 0;
        for (int anInt : ints) {
            resul += anInt;
        }
        System.out.println(resul);
    }
}
