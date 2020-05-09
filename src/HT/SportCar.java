package HT;

public class SportCar extends Car {
    private String speed;
    private int volume;

    public void turbo(){
        System.out.println("frfrfrfrrf");
    }

    public SportCar() {
    }

    public SportCar(String name, String age, String speed, int volume) {
        super(name, age);
        this.speed = speed;
        this.volume = volume;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "speed='" + speed + '\'' +
                ", volume=" + volume +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                "} " + super.toString();
    }

    @Override
    public void color() {
        super.color();
    }
}
