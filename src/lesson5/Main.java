package lesson5;

public class Main {
    public static void main(String[] args) {
        User5 user5 = new User5(1, "Sofi");
        Customer customer = new Customer();
        customer.setId (1);
        customer.setName("ssss");
        customer.action();

        Customer customer1 = new Customer(1,"aaaaaaa","sdd", "2569");
        customer1.action();// нащадок викорст авто батька

        Client client = new Client();
        foovbar(user5);
        foovbar(customer1); //customer ex user5
        foovbar(client);// client ex customer --> ex User5

        User5 user = new Customer();
        User5 user51 = new Client();// обьект на основого друг друга можем построить


    }
public static void foovbar(User5 user){
    System.out.println(user.getId());
    System.out.println(user.getName());
    //System.out.println(user.getLogin()); мы не сможем т.к юзер 5 содержит толко 2 поля выше

}
}
