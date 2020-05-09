package PC;

public class Main {
    public static void main(String[] args) {
    Laptop hp = new Laptop("HP",2, 5.265);
        hp.brand();
        hp.history();

        System.out.println();
        System.out.println();

        Workstation workstation = new Workstation("HP",2, 5.265, 30,50);
        //System.out.println(workstation.monitor);
       // workstation.setMonitor();
        workstation.update();
    }

}
