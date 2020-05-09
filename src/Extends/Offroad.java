package Extends;

public class Offroad extends SportCar {
    private String size;

     public void Location(){
         System.out.println("forest");
     }

    public Offroad() {
    }

    public Offroad(String name, String age, String speed, int volume, String size) {
        super(name, age, speed, volume);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Offroad{" +
                "size='" + size + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                "} " + super.toString();
    }

    @Override
    public void turbo() {
        super.turbo();
    }

}


