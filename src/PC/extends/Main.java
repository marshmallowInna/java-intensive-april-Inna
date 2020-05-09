package PC;

public class Main {
    public static void main(String[] args) {
    PC.Laptop hp = new PC.Laptop("HP",2, 5.265);
        hp.brand();
        hp.history();

        System.out.println();
        System.out.println();

        PC.Workstation workstation = new PC.Workstation("HP",2, 5.265, 30,50);
        //System.out.println(workstation.monitor);
       // workstation.setMonitor();
        workstation.update();
    }

}
