package PC;
public class Workstation extends PC.Laptop {
    public int monitor;
    public int size;


    public Workstation() {
    }

    public Workstation(String model, int id, double volume, int monitor, int size) {
        super(model, id, volume);
        this.monitor = monitor;
        this.size = size;
    }
    public void update(){
        System.out.println(monitor);
        System.out.println(size);
    }

    public int getMonitor() {
        return monitor;
    }

    public void setMonitor(int monitor) {
        this.monitor = monitor;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Workstation{" +
                "monitor=" + monitor +
                ", size=" + size +
                "} " + super.toString();
    }

    @Override
    public void brand() {
        super.brand();
    }

    @Override
    public void history() {
        super.history();
    }
}
