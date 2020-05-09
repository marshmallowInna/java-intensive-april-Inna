package HT;

public class Minivan extends Offroad {

    public void shipping(){
        System.out.println("quantity");
    }

    public Minivan() {
    }

    public Minivan(String name, String age, String speed, int volume, String size) {
        super(name, age, speed, volume, size);
    }

    @Override
    public String toString() {
        return "Minivan{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                "} " + super.toString();
    }

    @Override
    public void Location() {
        super.Location();
    }
}
