package PC;

public class Laptop {
    private String model ;
    private int id;
    private double volume= 25 ;

    public void brand() {
        System.out.println("amazing -" );
    }

    public void history() {
        System.out.println();
    }
    public void showVolum(){
        System.out.println(volume);
    }

    public Laptop() {
    }

    public Laptop(String model, int id, double volume) {
        this.model = model;
        this.id = id;
        this.volume = volume;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "model='" + model + '\'' +
                ", id=" + id +
                ", volume=" + volume +
                '}';
    }
}
